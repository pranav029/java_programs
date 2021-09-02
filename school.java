class Person{
    private String name;
    Person(String name)
    {
        this.name=name;
    }
    String fetch_name()
    {
        return name;
    }
}
class Student{
     private String name;
     Student(String name)
     {
         this.name=name;
     }
     String fetch_name()
     {
         return name;
     }
}
class Teacher extends Person{
    private int salary;
    private String subject;
    Teacher(String name,int salary,String subject)
    {
        super(name);
        this.salary=salary;
        this.subject=subject;
    }
    void display()
    {
        System.out.println("Teacher name: "+fetch_name());
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
    }
}
class College_Student extends Student{
    private int year;
    private String major;
    College_Student(String name,int year,String major)
    {
        super(name);
        this.year=year;
        this.major=major;
    }
    void display()
    {
        System.out.println("Student name: "+fetch_name());
        System.out.println("Year: "+year);
        System.out.println("Major: "+major);
    }
}
public class school {
    public static void main(String args[])
    {
        Teacher T=new Teacher("Shivam Prakash Mishra",50000,"Operating System");
        College_Student C=new College_Student("Pranavmani Tripathi",2019,"Timepass");
        System.out.println("Teacher Detail:");
        T.display();
        System.out.println("Student Detail:");
        C.display();
    }
    
}
