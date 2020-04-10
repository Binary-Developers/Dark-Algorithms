import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        long number,square,temp,count=0,reverse=0,i=1,num=0;
        number = sc.nextLong();
        square=number*number;
        temp=number;
        while( (int)temp>0)
       {  count=count+1;
          temp=temp/10;
       }  
       while(i<=count)
       { num=num*10+square%10;
         square=square/10;
         i++;
       }
       while ((int)num>0)
       { reverse=(int)reverse*10+num%10;
         num=num/10;
       }
       if (reverse == number)
         System.out.println("Autormorphic number");
        else
         System.out.println("Not an Autormorphic number");
    }
} 
/* Input -
Enter number                                                                                                                           
6 

Output -
Autormorphic number */                                                                                                                    
                     
   