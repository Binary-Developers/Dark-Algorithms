
import java.util.*;
public class minimumCostPath {
	
	
static int minimumPath(int arr[][],int cost[][],int x,int y)
{
	if(x==0 || y==0)
		return cost[x][y];
	return Math.min(minimumPath(arr,cost,x-1,y),minimumPath(arr,cost,x,y-1))+arr[x][y];
}
	
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,sum,x,y;
	System.out.println("Enter number of rows and columns of the matrix");
	int r=sc.nextInt();
	int c=sc.nextInt();
    int arr[][] = new int[r][c];
    System.out.println("Enter matrix");
    for(i=0;i<r;i++)
    {
    	for(j=0;j<c;j++)
    	{
    		arr[i][j]=sc.nextInt();
    	}
    }
    int cost[][]=new int[r][c];
    for(i=0;i<r;i++)
    {   sum=0;
    	for(j=0;j<=i;j++)
    	{
    		sum+=arr[j][0];
    	}
    	cost[i][0] = sum;
    }
    for(i=0;i<c;i++)
    {   sum=0;
    	for(j=0;j<=i;j++)
    	{
    		sum+=arr[0][j];
    	}
    	cost[0][i] = sum;
    }
    cost[0][0]=arr[0][0];
    System.out.println("Enter x and y of the target cell");
    x=sc.nextInt();
    y=sc.nextInt();
    System.out.println(minimumPath(arr,cost,x,y));
    
}
}