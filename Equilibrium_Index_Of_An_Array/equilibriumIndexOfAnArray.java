import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m,n;
        long leftSum=0,rightSum=0;
        System.out.println("Enter length of array");
        n=sc.nextInt();
        long arr[]=new long[n];
        long array[]=new long[n];
        System.out.println("Enter the elements of array");
        for(i=0;i<n;i++)
        arr[i]=sc.nextLong();
        for(i=0;i<n;i++)
        array[i]=arr[i];
        for(i=1;i<n;i++)
        array[i]=array[i]+array[i-1];
        rightSum=array[n-1];
        for(i=0;i<n;i++)
        {   if(i-1>=0)
            leftSum=leftSum+arr[i-1];
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum)
            break;
        }
        if(i==n)
        System.out.println("-1");
        else 
        System.out.println(i);
    }
}
/* Input - 
Enter length of array                                                                                                                  
7                                                                                                                                      
Enter the elements of array                                                                                                            
-7
1
5
2
-4
3
0

Output -
3 */                                                                                                                                    
