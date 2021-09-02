import java.util.*;
class create{
    private int n;
    void range(int N)
    {
      n=N;
      print();
    }
   private void print()
   {
       for(int i=0;i<n;i++)
       {
           String s="";
           for(int j=0;j<n;j++)
           {
               if(i%(n-1)==0 || j%(n-1)==0)
                 s+="* ";
              //  else if(i==j) s+="@ ";
              //  else if(i==(n-1-j)) s+="# ";
                else s+="  "; 
           }
           System.out.println(s);
       }
   }
}
public class square {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       create c=new create();
       System.out.println("Enter n: ");
       c.range(sc.nextInt());
    }
}
