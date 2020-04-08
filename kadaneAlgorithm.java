import java.util.*;
 class abc
{   static long findMaxSumArray(long arr[],long dp[],int x)
    {   long currentSum=0,maxSum=0;int i;
        if(x==1)
        return dp[0];
        for(i=1;i<x;i++)
        {currentSum=Math.max(dp[i-1],(dp[i-1]+arr[i]));
        dp[i]=Math.max(currentSum,arr[i]);}
        for(i=0;i<x;i++)
         if(maxSum<=dp[i])
             maxSum=dp[i]; 
        return maxSum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m,n;
        n=sc.nextInt();long sum=0,maxSum=0;
        long a[]=new long[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextLong();
        long dp[]=new long[n];
        dp[0]=a[0];
        sum=findMaxSumArray(a,dp,n);
        System.out.println(sum);
    }
}
/* Input/Output :
5
4 2 -3 -1 8
19 */
