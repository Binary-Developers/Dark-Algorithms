import java.util.*;
public class Main 
{   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int indexI,arrayLength,count=0,indexJ;
       System.out.println("Enter length of array");
       arrayLength=sc.nextInt();
       int array[]=new int[arrayLength];
       for(indexI=0;indexI<arrayLength;indexI++)
       array[indexI]=sc.nextInt();
       for(indexI=0;indexI<arrayLength;indexI++)
       {
           for(indexJ=indexI+1;indexJ<arrayLength;indexJ++)
           {
               if(array[indexI]>array[indexJ])
               count++;
           }
       }
       System.out.println(count);
    }
}

/* Input/Output - 
Enter length of array                                                                                                                        
4                                                                                                                                            
8 4 21 2                                                                                                                                     
4  */