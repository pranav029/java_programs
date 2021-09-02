import java.util.*;

class factorial {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a number:");
        long num=sc.nextLong();
        long fact=1;
        while(num>0)
        {
            fact*=num;
            num--;
        }
        System.out.print("Factorial is:"+fact);
    }
}
