import java.util.*;
class CatalanNumbers 
{
    static long findCatalanNumber(int n,long dp[])
    {   long result=0;
        if(n<=1)
        return 1;
        if(dp[n]!=0)
         return dp[n];
        for(int i=0;i<=n-1;i++)
         result=result+findCatalanNumber(i,dp)*findCatalanNumber(n-1-i,dp);
        return dp[n]=result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m,n;
        System.out.println("Enter limit");
        n=sc.nextInt();
        long dp[]=new long[100000];
        for(i=0;i<100000;i++)
        dp[i]=0;
        for(i=0;i<n;i++)
         System.out.println(findCatalanNumber(i,dp));
    }
}
/* Input/Output - 
Enter limit 
5
1 2 5 14 42 */
