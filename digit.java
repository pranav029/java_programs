import java.util.*;
public class digit {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a character:");
        char d= sc.next().charAt(0);
        int c = d; 
        System.out.println("ASCII value : "+c+" ");
        if(c>=65 && c<=122)
        System.out.print("Alphabet");
        else if((c>=32 && c<=47) || (c>=58 && c<=64))
        System.out.print("Special Charactar");
        else if(c>=48 && c<=57)
        System.out.print("Digits");
    }
}
