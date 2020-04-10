import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        long number,temp,sum=0,count=0;
        number = sc.nextLong();
        temp=number;
        while( (long)temp>0)
       {  count=count+1;
          temp=temp/10;
       }  temp=number;
       while((long)temp>0)
       {
           sum=sum+(long)Math.pow(temp%10,count);
           temp=temp/10;
       }
       if (sum == number)
         System.out.println("Armstrong number");
        else
         System.out.println("Not an Armstrong number");
    }
} 
/* Input -
Enter number                                                                                                                           
1634                                                                                                                                   


Output -
Armstrong number  */                                                                                                                    
                     
   
