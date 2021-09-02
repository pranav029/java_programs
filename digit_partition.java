import java.util.*;
class partition{
    private int num;

    private int quotient(int a,int b)
    {
        return a/b;
    }
    private int remainder(int a,int b)
    {
        return a%b;
    }
    String display_Digits(int num)
    {
        this.num=num;
        int n=num;
        String s="";
        while(n>0)
        {
            int r=remainder(n,10);
            String temp=s;
            s=r+" "+temp;
            n=quotient(n, 10);
        }
        return s;
    }
}
public class digit_partition {
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a number in range 1-99999:");
        int num=m.nextInt();
        while(num>99999 || num<1)
        {
         System.out.println("Number not in range 1-99999:");
         num=m.nextInt();
        }
        partition p=new partition();
        System.out.println(p.display_Digits(num));
    }
    
}
