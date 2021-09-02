import java.util.*;
class Account{
    private int acc_no;
    private float bal,curr_bal;
    private String name,add,type;
    Account(int no,String name)
    {
        this.name=name;
        this.acc_no=no;
        bal=5000;
        curr_bal=bal;
        add="N.A";
        type="Savings";
    }
    Account(String name,int no,String add,String type,float bal)
    {
        this.name=name;
        this.acc_no=no;
        this.add=add;
        this.type=type;
        this.bal=bal;
        curr_bal=bal;
    }
    void deposite(float amt)
    {
       this.curr_bal=bal+amt;
    }
    void withdraw(float amt)
    {
        this.curr_bal=bal-amt;
    }
    float GetBalance()
    {
        return curr_bal;
    }
    void display()
    {
        System.out.println("Account Holder Name: "+name);
        System.out.println("Account Number: "+acc_no);
        System.out.println("Address: "+add);
        System.out.println("Account Type: "+type);
        System.out.println("Previous Balance: "+bal);
        System.out.println("Current Balance: "+curr_bal);

    }
}
public class acc {
    public static void main(String args[])
    {
        Account a1=new Account(102121,"Mukesh Kumar");
        Account a2=new Account("Abhinav Ashish",102123,"Ratu Road Ranchi","Savings",7000);
        Account a3=new Account("Shivam Prakash Mishra",102127,"Allahabad UP","Savings",9000);
        a1.deposite(2000);
        a2.withdraw(5000);
        a3.withdraw(3000);
        a1.display();
        System.out.println();
        a2.display();
        System.out.println();
        a3.display();
    }
    
}
