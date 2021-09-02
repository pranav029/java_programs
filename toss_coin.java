import java.util.*;
class coin{
    private int head_c,tail_c;
    void count()
    {
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Flip coin");
        System.out.println("2.Show Result");
        System.out.println("3.Exit");
        System.out.print("Enter Choice:");
        input=sc.nextInt();
        if(input==3)
        {
            System.out.println("Program Aborted");
            return;
        }
        while(input==1)
        {
            if(flip()) head_c++;
            else tail_c++;
            System.out.print("Enter Choice:");
            input=sc.nextInt();
        }
        display();
    }
    private boolean flip()
    {
        Random r=new Random();
        return r.nextBoolean();
    }
    private void display()
    {
        System.out.println("Number of times Head appeared: "+head_c);
        System.out.println("Number of times Tail appeared: "+tail_c);
    }

}
class toss_coin {
     public static void main(String args[])
     {
         coin c=new coin();
         c.count();
     }
}
  