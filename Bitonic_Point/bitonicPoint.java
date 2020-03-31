import java.util.*;
public class Main
{   static int bitonicPoint(int a[],int low,int high)
  {   int answer=-1;
      if(low<high)
    {int mid=(low+high)/2;
    if(a[mid]>a[mid-1] && a[mid]>a[mid+1] )
    answer=mid;
    else if(a[mid]<a[mid+1])
    answer= bitonicPoint(a,mid,high);
    else
    answer= bitonicPoint(a,low,mid);
    }
    return answer;
  }
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int indexI,indexJ,mid,high,low,arrayLength,bPoint;
	   System.out.println("Enter the array length");
	   arrayLength = sc.nextInt();
	   int array[]=new int[arrayLength];
	   System.out.println("Enter the array elements");
	   for(indexI=0;indexI<arrayLength;indexI++)
	   {
	       array[indexI]=sc.nextInt();
	   }
	    bPoint=bitonicPoint(array,0,(arrayLength-1));
	    if(bPoint!=-1)
	    System.out.println(array[bPoint]);
	}
}

/*
Input - Output :
Enter the array length                                                                                                                       
8                                                                                                                                            
Enter the array elements                                                                                                                     
6                                                                                                                                            
7                                                                                                                                            
8                                                                                                                                            
9                                                                                                                                            
10                                                                                                                                           
15                                                                                                                                           
4                                                                                                                                            
2                                                                                                                                            
15 */
