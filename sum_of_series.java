import java.util.*;

public class sum_of_series {
      public static void main(String args[])
      {
        Scanner sc= new Scanner(System.in); 
        System.out.print(" Enter n of the series : ");
        int n= sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(i*(i+1))/2;
        }
        System.out.print(" "+sum);
      }
    
}
