import java.util.*;
class transmit{
    private int num;
    transmit(int n)
    {
        num=n;
        encrypt();
    }
    private int len(int n)
    {
        int c=0;
        for(int i=n;i>0;i/=10)
        c++;
        return c;
    }
    private int swap(int n)
    {
        int div=1000,sum=0;
        while(n>0)
        {
             if(len(div)%2==0)
             {
                 sum+=(n%10)*(div/10);
             }
             else
                 sum+=(n%10)*(div*10);
            n/=10;   
            div/=10;  
        }
       return sum;
    }
    private int process_enc(int n)
    {
        int div=1,sum=0;
        while(n>0)
        {
            int temp=((n%10)+7)%10;
            sum+=temp*div;
            div*=10;
            n/=10;
        }
        return sum;
    }
    private int process_dec(int n)
    {
        int div=1,sum=0;
        while(n>0)
        {
            int temp=((n%10)+10-7)%10;
            sum+=temp*div;
            div*=10;
            n/=10;
        }
            while(div!=10000)
            {
                sum+=3*(div%10000);
                div*=10;
            }
        return sum;
    }
    private void encrypt()
    {
        num=process_enc(num);
        num=swap(num);
    }
    int decrypt()
    {
        int n=num;
        n=process_dec(n);
        n=swap(n);
        return n;
    }
    int show()
    {
        return num;
    }
}

public class telephone{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit telephone number: ");
        int n=sc.nextInt();
        System.out.println("Entered telephone number is : "+n);
        transmit T=new transmit(n);
        System.out.println("Telephone number after Encryption : "+T.show());
        System.out.println("Telephone number after Decryption : "+T.decrypt());
    }
}