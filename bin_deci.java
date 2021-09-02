import java.util.*;

class decimal{
    private int binary;
    decimal(int bin)
    {
        binary=bin;
    }
    private  int get_power(int num,int p)
    {
        if(p==0) return 1;
        if(p==1) return num;
        if(p%2==0) return get_power(num,p/2)*get_power(num, p/2);
        else return num*get_power(num, p-1);
    }
    int convert()
    {
        int p=0,sum=0,b=binary;
        while(b>0)
        {
          sum+=get_power(2,p)*(b%10);
          p++;
          b/=10;
        }
       return sum;
    }
}
public class bin_deci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        decimal d=new decimal(sc.nextInt());
        System.out.println("The decimal conversion is : "+d.convert());
    }
    
}
