import java.util.*;
public class moveElementToEnd {
public static void main(String[] args)
{   int i,j,k,l,m,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of array");
	 n = sc.nextInt();
	System.out.println("Enter elements of array");
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter element");
	k=sc.nextInt();
	i=0;j=n-1;
	while(i<j)
	{
		if(arr[i]==k && arr[j]!=k)
		{
			m=arr[j];
			arr[j]=arr[i];
			arr[i]=m;
			i++;
			j--;
		}
		else if(arr[i]!=k)
			i++;
		else if(arr[j]==k)
			j--;
	}
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
/* 
Enter length of array
7
Enter elements of array
2 2 2 2 5 6 1
Enter element
2
1 6 5 2 2 2 2 */
