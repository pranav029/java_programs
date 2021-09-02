import java.util.*;
class Customer{
     String first_name;
     String  last_name;
     double bill;
    Customer(String f,String l,double bill)
    {
        this.first_name=f;
        this.last_name=l;
        this.bill=bill;
    }
    void set_f_name(String f)
    {
        this.first_name=f;
    }
    void set_l_name(String l)
    {
        this.last_name=l;
    }
    void set_bill(double b)
    {
        if(b<100){
            System.out.println("Check the bill");
            this.bill=-1;
            return;
        }
        this.bill=b;
    }
    String get_f_name()
    {
        return this.first_name;
    }
    String get_l_name()
    {
        return this.last_name;
    }
    String get_bill()
    {
        if(this.bill<0)return "Error in Bill";
        return Double.toString(this.bill);
    }
    void inc(int per)
    {
        double temp=(per*this.bill)/100;
        this.bill+=temp;
    }
    void display()
    {
        System.out.println("First Name :"+this.first_name);
        System.out.println("Last Name :"+this.last_name);
        System.out.println("monthly_grocery_bill :"+this.bill);
    }
    
}
public  class javalab_2 {
    static Customer init(Customer c)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        c.set_f_name(sc.nextLine());
        System.out.println("Enter last name:");
        c.set_l_name(sc.nextLine());
        System.out.println("Enter monthly_grocery_bill:");
        c.set_bill(sc.nextDouble());
        return c;
    }
    public static void main(String args[])
    {
        System.out.println("Pranavmani Tripathi\nBTECH/60077/19\n");
       Customer c1=new Customer("","",0);
       Customer c2=new Customer("","",0);
       Customer c3=new Customer("","",0);
       System.out.println("Enter first customer details:");
       c1=init(c1);
       System.out.println("Enter second customer details:");
       c2=init(c2);
       System.out.println("Enter third customer details:");
       c3=init(c3);
       System.out.println("......First cumtomer Details......");
       c1.display();
       System.out.println("......Second cumtomer Details......");
       c2.display();
       System.out.println("......Third cumtomer Details......");
       c3.display();
       c1.inc(6);
       c2.inc(6);
       c3.inc(6);
       System.out.println("......After bill inflation......");
       System.out.println("First customer Monthly bill "+c1.get_bill());
       System.out.println("Second customer Monthly bill "+c2.get_bill());
       System.out.println("Third customer Monthly bill "+c3.get_bill());
    }
}
