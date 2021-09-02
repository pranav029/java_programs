import java.util.*;
class grade{
    String pts(int marks)
    {
        marks/=10;
        switch(marks)
        {
            case 10:
            case 9: return "4";
            case 8: return "3";
            case 7: return "2";
            case 6: return "1";
            default: return "0"; 
        }
    }
}
public class points {
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter marks:");
        int marks=n.nextInt();
        grade g=new grade();
        System.out.println("Grade Point: "+g.pts(marks));
    }
}
