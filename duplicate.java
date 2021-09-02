import java.util.*;
 class detect{
     private int[] arr;
     private int k=0;
     detect()
     {
         arr=new int[5];
         in_num();
         display();
     }
     void in_num()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter five numbers:");
         int i=0;
         while(i<5)
         {
            int in=sc.nextInt();
            if(in<10 || in>100){
                System.out.println("Numbers not in range 10-100");
                System.out.println("Enter again:");
                continue;
            }
            if(!search(in,i-1))
            {
                System.out.println(in);
                arr[k++]=in;
            }
            i++;
         }
     }
     private boolean search(int in,int h)
     {
         if(h<0) return false;
         for(int i=0;i<=h/2;i++)
         {
             if(arr[i]==in || arr[h-i]==in)
             return true;
         }
         return false;
     }
         private void display()
         {
             for(int i=0;i<k;i++)
             System.out.print(arr[i]+" ");
         }
 }




 
public class duplicate {
    public static void main(String args[])
    {
        detect d=new detect();
    }
    
}
