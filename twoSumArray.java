import java.util.*;
public class twoSumArray {
public static void main(String[] args)
{   int i,j,k,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array");
	n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
	{   
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter the target sum");
	k=sc.nextInt();
	Arrays.sort(arr);
	i=0;j=n-1;
	while(i<j)
	{
		if(arr[i]+arr[j]>k)
			j--;
		else if(arr[i]+arr[j]<k)
			i++;
		else
		{
			System.out.println(arr[i]+" "+arr[j]);
			break;
		}
	}
	
		
}
}
/*
Enter the length of array
5 
Enter the array elements
7 10 23 12 5 
Enter the target sum
28
5 23
*/