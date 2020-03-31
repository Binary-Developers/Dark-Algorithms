import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int numberOfRows,numberOfColumns,indexI,indexJ;
        float sumOfEachRow;boolean b=true;
        System.out.println("Enter number of rows and columns");
        numberOfRows=sc.nextInt();
        numberOfColumns=sc.nextInt();
        float array[][]=new float[numberOfRows][numberOfColumns];
        for(indexI=0;indexI<numberOfRows;indexI++)
        {
            for(indexJ=0;indexJ<numberOfColumns;indexJ++)
            {
                array[indexI][indexJ]=sc.nextFloat();
            }
        }
        
         
        for(indexI=0;indexI<numberOfRows;indexI++)
        {   sumOfEachRow=0.0f;
            for(indexJ=0;indexJ<numberOfColumns;indexJ++)
            { 
                sumOfEachRow=sumOfEachRow+array[indexI][indexJ];
            }
            System.out.println(sumOfEachRow);
            if((int)sumOfEachRow!=1)
            { b=false;
            break;
            }
            
        }
        if(!b)
            System.out.println("The matrix is not a Markov Matrix");
        else
        System.out.println("The matrix is a Markov Matrix");
    }
}
/* Input - Output :
Enter number of rows and columns
2
2
1 
0
0
1

The matrix is a Markov Matrix */
