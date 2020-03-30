import java.util.*;
class sn
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int indexI,tempNumber,currentDigit,previousDigit,n,m;
        System.out.println("Enter the range ");
        n=sc.nextInt();
        m=sc.nextInt();
        boolean b=true;
        
        System.out.println("The steppping numbers in the range are ");
        for(indexI=n;indexI<=m;indexI++)
        {   b=true;previousDigit=-1;
            tempNumber=indexI;
            while(tempNumber>0)
            {   currentDigit=tempNumber%10;
                if(previousDigit==-1)
                previousDigit=currentDigit;
                else
                {
                    if(Math.abs(previousDigit-currentDigit)!=1)
                    b=false;
                }
                tempNumber=tempNumber/10;
                
            }
            if(b)
                System.out.print(indexI+" ");
        }
        System.out.println();
    }
}

/* Input/Output 
Enter the range 
10 18
The steppping numbers in the range are 
10 12 
 */
        
