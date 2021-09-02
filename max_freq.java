import java.util.*;

public class max_freq {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] num=new int[n];
        int max=0;
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int freq=0;
          for(int j=i+1;j<n;j++)
          {
              if(num[i]==num[j])
                freq++;
          }
          if(max<=freq)
             max=num[i];
        }

        System.out.println("Frequency Max : "+max);
    }
    
}
