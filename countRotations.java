import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int indexI,minElement,lengthOfArray,indexOfMinElement;
        System.out.println("Enter length of array");
        lengthOfArray=sc.nextInt();
        int array[]=new int[lengthOfArray];
        for(indexI=0;indexI<lengthOfArray;indexI++)
        array[indexI]=sc.nextInt();minElement=array[0];indexOfMinElement=0;
        for(indexI=1;indexI<lengthOfArray;indexI++)
        {
            if(array[indexI]<minElement)
            {
                minElement=array[indexI];
                indexOfMinElement=indexI;
            }
        }
        System.out.println(indexOfMinElement);
    }
}

/* 
Input/Output - 
Enter length of array                                                                                                                      
6                                                                                                                                          
5 6 1 2 3 4                                                                                                                                
2 */                                                                                                                                         
     