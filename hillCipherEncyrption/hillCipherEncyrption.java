import java.util.*;
class hc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m,n;
        String s,str,key;
        s=sc.nextLine();
        key=sc.nextLine();
        n=s.length();
        int en[][]=new int[n][n];
        int se[][]=new int[n][1];
        int sen[][]=new int[n][1];
        s=s.toUpperCase();
        key=key.toUpperCase();
        System.out.println(s);
        System.out.println(key);
        
        k=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                en[i][j]=key.charAt(k++)-65;
            }
        }
        
        k=0;
        for(j=0;j<n;j++)
        {
            se[j][0]=s.charAt(k++)-65;
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sen[i][0]+=en[i][j]*se[j][0];
            }
        }
          
           
            
        for(j=0;j<n;j++)
            { 
                sen[j][0]=sen[j][0]%26;
                
            }
            
   
        str="";
        for(j=0;j<n;j++)
        {
          str=str+(char)(sen[j][0]+65);
        }
        System.out.println(str);
}
}  
/* Input -
 Plaintext: ACT
 Key: GYBNQKURP
 Output -
 Ciphertext: POH */
