import java.util.*;
import java.lang.Math;
import java.lang.*;
class pie{
   private double num;
   private int decimal;
   void find_pie(double d)
   {
    String s=String.valueOf(d);   
    s=s.replace(".","");
    num=Double.parseDouble(s);
    find_decimal(d);
    calc(d);
   }
  private void find_decimal(double d)
   {
       int temp=(int)d,div=1,nm=(int)num;
       while(nm>temp)
       {
           div*=10;
           nm/=10;
       }
       decimal=div;
   }
  private void calc(double d)
   {
       int i;
       double n=4;
       for(i=1;true;i++)
       {
           double term=3+(i-1)*2;
           double f=(4/term)*Math.pow(-1,i);
           n+=f;
           int temp=(int)(n*decimal);
           String s=String.valueOf(temp);
           s=s.substring(0,1)+"."+s.substring(1);
           System.out.println(s+"  "+i);
           if(temp==num) break;
       }
         System.out.println("The iteration of "+d+" is "+i);
   }
}
public class pie_series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        pie p=new pie();
         p.find_pie(sc.nextDouble());
    }
    
}
