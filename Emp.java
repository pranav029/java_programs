import java.util.*;
class Employee{
    private String f_name;
    private String l_name;
    private double m_salary;
    Employee(String str,double sal)
    {
        f_name=l_name=str;
        m_salary=sal;
    }
    void set_fname(String str)
    {
        f_name=str;
    }
    void set_lname(String str)
    {
        l_name=str;
    }
    void set_salary(double sal)
    {
        if(sal<0.0)
         m_salary=0.0;
        else  m_salary=sal;  
    }
    String get_fname()
    {
        return f_name;
    }
    String get_lname()
    {
        return l_name;
    }
    double get_salary()
    {
        return m_salary;
    }
    void inc_salary(double inc)
    {
        m_salary+=(m_salary*inc)/100;
    }
    void capabilities()
    {
        System.out.println("First Name : "+this.get_fname());
        System.out.println("Last Name : "+this.get_lname());
        System.out.println("Monthly Salary : "+this.get_salary());
        System.out.println("Yearly Salary : "+this.get_salary()*12);
    }
     Employee init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        this.set_fname(sc.nextLine());
        System.out.println("Enter last name:");
        this.set_lname(sc.nextLine());
        System.out.println("Enter Monthly salary:");
        this.set_salary(sc.nextDouble());
        return this;
    }
}


public class Emp {
   
    public static void main(String args[])
    {
       Employee E1=new Employee("",0);
       Employee E2=new Employee("",0);
       System.out.println("Enter data for 1st Employee:");
       E1=E1.init();
       System.out.println("Enter data for 2nd Employee:");
       E2=E2.init();
       System.out.println("Capabilities of 1st Employee:");
       E1.capabilities();
       System.out.println("Capabilities of 2nd Employee:");
       E2.capabilities();
       E1.inc_salary(10);
       E2.inc_salary(10);
       System.out.println("Monthly Salary after increment of "+E1.get_fname()+" "+E1.get_lname()+" : "+E1.get_salary());
       System.out.println("Monthly Salary after increment of "+E2.get_fname()+" "+E2.get_lname()+" : "+E2.get_salary());
    }
}
