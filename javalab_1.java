import java.util.*;
class transmit{
    private int enc[]=new int[10];
    private int qt[]=new int[10];
    private void reverse()
    {
        int swap;
        for(int i=0;i<5;i++)
        {
            swap=enc[i];
            enc[i]=enc[9-i];
            enc[9-i]=swap;
        }
    }
    void enc(int arr[])
    {
        for(int i=0;i<10;i++)
        {
            enc[i]=arr[i]*5;
            qt[i]=enc[i]/4;
            enc[i]=enc[i]%4;
        }
        reverse();
        System.out.print("Data after encryption:");
        for(int i=0;i<10;i++)
         System.out.print(enc[i]+" ");
       System.out.println();  
    }
    String dec()
    {
        reverse();
        String str="";
        for(int i=0;i<10;i++)
        {
            int temp=(qt[i]*4)+enc[i];
            temp/=5;
            str+=temp+" ";
        }
        return str;
    }
}
public class javalab_1 {
    public static void main(String args[])
    {
        System.out.println("Pranavmani Tripathi\nBTECH/60077/19\n");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter Number");
        for(int i=0;i<10;i++)
        arr[i]=sc.nextInt();
        transmit T=new transmit();
        T.enc(arr);
        System.out.println("Data after decryption: "+T.dec());
    }
    
}
