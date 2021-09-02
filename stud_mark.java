import java.util.*;
public class stud_mark {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        int[] num=new int[10];
        int mean=0;
        System.out.println("Enter the marks of 10 students : ");
        for(int i=0;i<10;i++)
        {
            num[i]= sc.nextInt();
            mean+=num[i];
        }
        mean=mean/10;
        System.out.println("Marks greater than mean "+mean+" : ");
        for(int i=0;i<10;i++)
        {
            if(num[i]>mean)
            System.out.println(" "+num[i]); 
        }
    }
    
}
