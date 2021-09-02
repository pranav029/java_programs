public import java.util.*;
class sachin
{
    static int n;
    static int arr[] = new int[10];
    public static void main (String []Args)
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("SACHIN \t BTECH/60055/19 ");
        System.out.println("Enter Degree of Polynomial");
        n = in.nextInt();
        int m =n;
        for(int k=0;k<=n;k++)
            {
                System.out.println("Enter coefficient of x^"+m);
                arr[k]=in.nextInt();
                m--;
            }
        double buffer = 0;
        for(int i =-20000; i<20000; i++)
        {
           if(buffer != newtonRaphson(i))
           {
               if(0 == func(i))
               {
                   System.out.println("The value of the" + " root is : " + newtonRaphson(i));
                   buffer = newtonRaphson(i);
               }
           }
        }
    }
    static final double EPSILON = 0.001;
    static double func(double x)
    {
        int m = n;
        double res = 0;
        for(int k = 0; k<=n; k++)
        {
            res += arr[k] * Math.pow(x, m);
            m--;
        }
        return res;//x * x * x - 6 * x * x + 11 * x - 6;
    }
    static double derivFunc(double x)
    {
        int m = n;
        double res = 0;
        for(int k = 0; k<n; k++)
        {
            res += m * arr[k] * Math.pow(x, m-1);
            m--;
        }
        return 3 * x * x - 12 * x + 11;
    }
    static double newtonRaphson(double x)
    {
        double h = func(x) / derivFunc(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = func(x) / derivFunc(x);
            x = x - h;
        }
        return (Math.round(x * 100.0) / 100.0);
    }
}
