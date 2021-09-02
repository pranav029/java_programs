import java.util.*;
public class reverse_pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i%2!=0)
                {
                   System.out.print(c+" ");
                   c++;
                }
                else{
                   System.out.print(c+4-j+" ");
                   if(j==4)c+=5;
                }
            }
            System.out.println();
        }
    }
}
