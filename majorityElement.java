import java.util.*;
public class Main
{  
    
   static int partition(int a[],int low,int high)
   {
       int pivot=a[high];
       int i,j,temp;
       i=low-1;
       for(j=low;j<=high-1;j++)
       {
           if(a[j]<pivot)
           {
               i++;
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
        }
           temp=a[i+1];
           a[i+1]=a[high];
           a[high]=temp;
           return (i+1);
   }
   
   static void quickSort(int a[],int low,int high)
   {   if(low<high)
      {
       int pI;
       pI=partition(a,low,high);
       quickSort(a,low,pI-1);
       quickSort(a,pI+1,high);
      }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrayLength,indexI,element,count;
		System.out.println("Enter length of array");
		arrayLength=sc.nextInt();
		int array[]=new int[arrayLength];
		System.out.println("Enter array elements");
		for(indexI=0;indexI<arrayLength;indexI++)
		array[indexI]=sc.nextInt();
		quickSort(array,0,(arrayLength-1));
		element=array[0];count=0;
	    for(indexI=0;indexI<arrayLength;indexI++)
	    {
	        if(array[indexI]==element)
	        count++;
	        else
	        {
	            count=1;
	            element=array[indexI];
	        }
	        if(count>arrayLength/2)
	        break;
	    }
	    if(count>arrayLength/2)
	    System.out.println(element);
	    else
	    System.out.println("No majority element");
	}
}
/* 
Inpu-Output : 
Enter length of array                                                                                                                      
4                                                                                                                                          
Enter array elements                                                                                                                       
5                                                                                                                                          
5                                                                                                                                          
1  
5

5 */                                                                                                                               
             