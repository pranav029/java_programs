import java.util.*;

import javax.lang.model.util.ElementScanner14;
class find{
    private int acc;
    private int bal;
    private int t_charges;
    private int t_credit;
    private int a_credit;
    void set_data()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter account No: ");
      acc=sc.nextInt();
      System.out.println("Enter balance at beginning: ");
      bal=sc.nextInt();
      System.out.println("Enter total charges for this month: ");
      t_charges=sc.nextInt();
      System.out.println("Enter total credit applied this month: ");
      t_credit=sc.nextInt();
      System.out.println("Enter allowed limit for the customer");
      a_credit=sc.nextInt(); 
    }
    private void calc_nbal()
    {
        bal=bal+t_charges-t_credit;
    }
    private boolean check()
    {
       if(bal<a_credit)
       return true;
       else
       return false;
    }
    void show_bal()
    {
        System.out.println("Account No: "+acc);
        System.out.println("Allowed Credit Limit: "+a_credit);
        calc_nbal();
        System.out.println("New Balance: "+bal);
        if(check())
        System.out.println("Credit Available");
        else 
        System.out.println("Credit limit exceeded");
    }


}

public class credit {
    public static void main(String args[])
    {
        find F=new find();
        System.out.println("Enter details of customer: ");
        F.set_data();
        F.show_bal();
    }
    
}
