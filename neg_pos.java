import java.util.*;
public class neg_pos {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five digit no: ");
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        int z=0,n,k=0,j=0;
        System.out.println("Enter five numbers:");
        for(int i=0;i<5;i++)
        {
            n=sc.nextInt();
            if(n>0)
              arr1[k++]=n;
            if(n<0)
              arr2[j++]=n;
            if(n==0)
              z++;
        }  
        System.out.println("Positive  Negative");
        for(int i=0;i<5;i++)
        {
            if(arr1[i]!=0)
            System.out.print(arr1[i]);
            if(arr2[i]!=0)
            System.out.print("           "+arr2[i]);
          System.out.println();
        } 
        System.out.print("Number of zeros entered: "+z);    
    }
}
