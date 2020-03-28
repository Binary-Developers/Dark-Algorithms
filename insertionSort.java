import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int index,currentValue,position,lengthOfArray;
	   System.out.println("Enter array length");
	   lengthOfArray=sc.nextInt();
	   int a[]=new int[lengthOfArray];
	   System.out.println("Enter array elements");
	   for(index=0;index<lengthOfArray;index++)
	   a[index]=sc.nextInt();
	   System.out.println("Unsorted array is");
	   for(index=0;index<lengthOfArray;index++)
	   System.out.println(a[index]);
	   for(index=1;index<lengthOfArray;index++)
	   {currentValue=a[index];
        position=index;
        while ((position>0)&&( a[position-1]>currentValue))
          {  a[position]=a[position-1];
            position=position-1;
            a[position]=currentValue;
          }
	   }
	   System.out.println("Sorted array is");
	   for(index=0;index<lengthOfArray;index++)
	   System.out.println(a[index]);
	}
}