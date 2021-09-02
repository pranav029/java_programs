import java.util.*;
class get_pascal{
    private int n;
    get_pascal(int N)
    {
        n=N;
    }
    private int ncr(int n,int r)
    {
       if(n==r || r==1)
          return 1;
       if(r>0 && r<n)
         return ncr(n-1,r-1) + ncr(n-1,r);
       else return 0;     
    }
    void show_pascal()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
              System.out.print(" ");
            for(int j=1;j<i+1;j++)
               System.out.print(ncr(i,j)+" ");
            System.out.println();   
        }
    }
}
public class pascal {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter N to print Pascal Triangle:");
       get_pascal P=new get_pascal(sc.nextInt());
       P.show_pascal();
    }
}
