import java.util.*;
public class Main 
{   static int tribonacciNumbers(int limit,int dp[])
   {   int i;
       if(limit==1)
       return 0;
       if(limit==2 || limit==3)
       return 1;
       
       if(dp[limit]!=0)
       return dp[limit];
       
       for(i=4;i<=limit;i++){
       dp[limit]=tribonacciNumbers(limit-3,dp)+tribonacciNumbers(limit-2,dp)+tribonacciNumbers(limit-1,dp);
      
       }
       
       return dp[limit];
   }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();int answer;
        int dp[]=new int[limit+1];
        answer=tribonacciNumbers(limit,dp);
        System.out.println(answer);
    }
}