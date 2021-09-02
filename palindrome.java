import java.util.*;
class check{
    private int num;
    void set(int n)
    {
        this.num=n;
    }
    boolean len(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        if(c==5) return true;
        else return false;
    }
   boolean find()
   {
        int temp=num;
        int a,new_num=0;
        while(temp>0)
        {
            a=temp%10;
            new_num=new_num*10+a;
            temp/=10;
        }
        System.out.println("Number after reversing : "+new_num);
        if(num==new_num) return true;
        else return false;
   }
}
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print(" Enter a number to check for palindrome : ");
        int num= sc.nextInt();
        check C=new check();
        while(!C.len(num))
        {
         System.out.print("Not a five digit number Enter again:");
          num= sc.nextInt();
        }
        C.set(num);
        if(C.find())
        System.out.print(" The number is palindrome ");
        else
        System.out.print(" The number is not palindrome ");
    }
}
