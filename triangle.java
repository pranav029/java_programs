import java.util.*;
class side{
    private int s1,s2,s3;
    side(int p,int q,int r)
    {
        s1=p;
        s2=q;
        s3=r;
    }
    boolean find()
    {
         if(s1+s2<=s3) return false;
         if(s1+s3<=s2) return false;
         if(s2+s3<=s1) return false;
         return true;  
    }
}
public class triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,q,r;
        System.out.println("Enter sides of triangle : ");
        p=sc.nextInt();
        q=sc.nextInt();
        r=sc.nextInt();
        side s=new side(p,q,r);
        if(s.find())
        System.out.println("Triangle can be formed");
        else
        System.out.println("Triangle cannot be formed");
    }
    
}
