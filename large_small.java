import java.util.*;

public class large_small {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] num=new int[n];
        int max1=0,max2=0,min1,min2;
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]= sc.nextInt();
        }
        min1=min2=num[1];
        for(int i=0;i<n;i++)
        {
           if(max1<=num[i])
           {
               max2=max1;
               max1=num[i];
           }
           if(min1>=num[i])
           {
               min2=min1;
               min1=num[i];
           }
        }
        System.out.println("Largest : "+max1);
        System.out.println("2nd Largest : "+max2+" ");
        System.out.println("Smallest : "+min1);
        System.out.println("2nd Smallest : "+min2);
    }
}
