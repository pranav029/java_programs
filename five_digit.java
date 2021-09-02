import java.util.*;
public class five_digit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five digit no: ");
        int n=sc.nextInt();
        int div=10000;
        if((n/div)/10!=0)
          {
              System.out.println("Entered number is more than five digit:");
              return;
          }
        if(n/div==0)
        {
            System.out.println("Entered number is less than five digit:");
            return;
        }
        while(n>0)
        {
            System.out.print(n/div+"   ");
            n=n-(n/div)*div;
            div/=10;
        }
    }
}
