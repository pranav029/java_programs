import java.util.*;

public class twoD_reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int[][] arr= new int[2][2];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
              arr[i][j]=sc.nextInt();
        }
        System.out.println("Array without reverse:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
              System.out.print(arr[i][j]+" ");
          System.out.println("");    
        }
    
        for(int i=0;i<2;i++)
        {
                 int swap;
                 swap=arr[i][0];
                 arr[i][0]=arr[i][1];
                 arr[i][1]=swap;
        }   
        for(int i=0;i<2;i++)
        {
                 int swap;
                 swap=arr[0][i];
                 arr[0][i]=arr[1][i];
                 arr[1][i]=swap;
        }  
        System.out.println("Array after reverse:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
              System.out.print(arr[i][j]+" ");
          System.out.println("");    
        }
    }
}
