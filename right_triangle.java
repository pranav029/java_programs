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
         if((s1*s1)+(s2*s2)==(s3*s3)) return true;
         if((s1*s1)+(s3*s3)==(s2*s2)) return true;
         if((s2*s2)+(s3*s3)==(s1*s1)) return true;
         return false;  
    }
}
public class right_triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle : ");
        side s=new side(sc.nextInt(),sc.nextInt(),sc.nextInt());
        if(s.find())
        System.out.println("Right Triangle can be formed");
        else
        System.out.println("Right Triangle cannot be formed");
    }
    
}

