import java.util.*;
class  Main 
{   
    
   static void fibo(int a,int b,int n)
  {   int c;
    if(a<=n)
    {
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
        fibo(a,b,n);
    }
}

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int limit;
        System.out.println("Enter limit");
        limit=sc.nextInt();
        fibo(0,1,limit);
    }
}

/* Input 
Limit
13
Output
0 1 1 2 3 5 8 13
*/
