import java.util.*;

public class largest {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in); 
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int lar;
        System.out.println("Numbers are : "+x+" "+y+" "+z);
        if(x>y)
        {
            if(x>z)
                lar=x;
            else
               lar=z;
        }
        else{
            if(y>z)
              lar=y;
            else
              lar=z;
        }

        System.out.println("Largest : "+lar);

    }
}
