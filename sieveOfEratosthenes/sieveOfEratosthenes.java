import java.util.*;
class soe
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m,n;
        n=sc.nextInt();
       
        int status[]=new int[(n+1)];
        for(i=2;i<=n;i++)
        status[i]=0;
        for(i=2;i<=n;i++)
        {
            for(j=i*i;j<=n;j++)
            {
                if(j%i==0)
                status[j]=1;
            }
            
        
            for(k=i;k<j;k++)
            {    if(k>n)
                break;
                if(status[k]==0)
               { System.out.println((k)+" ");
                i=k;
                break;
                
            }
        }
        }
        
        }
    }
        
