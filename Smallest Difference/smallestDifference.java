
import java.util.*;
public class smallestDifference {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,k,l,m,n;
	System.out.println("Enter length of array 1");
	 n=sc.nextInt();
	 int arr[]=new int[n];
     System.out.print("Enter array 1");
	 for(i=0;i<n;i++)
		 arr[i]=sc.nextInt();
	 System.out.println("Enter length of array 2");
	 m=sc.nextInt();
	 int brr[]=new int[m];
     System.out.print("Enter array 2");
	 for(i=0;i<m;i++)
		 brr[i]=sc.nextInt();
	  Arrays.sort(arr);
	  Arrays.sort(brr);
	  int smallestPair[] = new int[2];
	  int currentDiff;
	  double smallestDiff = Double.POSITIVE_INFINITY;
	  i=0;
	  j=0;
	  while(i<arr.length && j<brr.length)
	  {   k=0;l=0;
		  if(arr[i] == brr[j])
		  {   
			  smallestPair[0]=arr[i];
			  smallestPair[1]=brr[j];
			  break;
		  }
		  else if(arr[i]<brr[j])
		  {
			  currentDiff = brr[j]-arr[i];
			  i++;
			  k=1;
		  }
		  else 
		  {
			  currentDiff = arr[i]-brr[j];
			  j++;
			  l=1;
		  }
		  if(currentDiff < smallestDiff)
		  {
			  smallestDiff = currentDiff;
			  smallestPair[0] = k == 0 ? arr[i]:arr[i-1];
			  smallestPair[1]= l == 0 ? brr[j]:brr[j-1];
		  }
	  }
	  System.out.println(smallestPair[0]+" "+smallestPair[1]);
}
}
