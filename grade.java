import java.util.*;
class student{
    private int marks;
    student(int m)
    {
        marks=m;
    }
    String get_grade()
    {
        int pass=marks/10;
        switch(pass)
        {
            case 10:
            case 9 : return "Grade A";
            case 8 : return "Grade B";
            case 7 : return "Grade C";
            case 6 : return "Grade D";
            case 5 : return "Grade E";
            default : return "Topper";
        }
    }
}
public class grade {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Student: ");
        student stud=new student(sc.nextInt());
        System.out.println("Grade of student is : "+stud.get_grade());
    }
    
}
