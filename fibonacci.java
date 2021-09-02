import java.util.*;
public class fibonacci {
     public static void main(String argsk[])
     {
          int a=0,b=1;
          while(a<=89)
          {
              System.out.print(" "+a);
              int c=a;
              a=b;
              b=a+c;
          }

     }     
}
