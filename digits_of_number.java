import java.util.*;
public class digits_of_number {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int rem,sum=0,f=1;
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("Sum : "+sum+" ");
        for(int i=2;i<sum/2;i++)
        {
            if(sum%i==0)
            {
              System.out.println("Not Prime");
              f=0;
              break;
            }
        }
        if(f==1)
        System.out.println("Prime");

    }
}
