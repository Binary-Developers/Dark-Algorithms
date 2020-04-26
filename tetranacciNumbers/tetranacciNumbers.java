import java.util.*;
public class Main 
{   static int tetranacciNumbers(int limit,int dp[])
   {   int i;
       if(limit==1)
       return 0;
       if(limit==2 || limit==3)
       return 1;
       if(limit == 4)
       return 2;
       if(dp[limit]!=0)
       return dp[limit];
       
       for(i=5;i<=limit;i++){
       dp[limit]=tetranacciNumbers(limit-4,dp)+tetranacciNumbers(limit-3,dp)+tetranacciNumbers(limit-2,dp)+tetranacciNumbers(limit-1,dp);
       
       }
       return dp[limit];
   }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int limit=sc.nextInt();int answer;
        int dp[]=new int[limit+1];
        answer=tetranacciNumbers(limit,dp);
        System.out.println(answer);
    }
}
/* Input/Output - 
 Enter number
 10 
 208 */
 
