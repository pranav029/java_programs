import java.util.*;
class income{
    private String name;
    private int l_week;
    private int h_rate;
    public static int c=0;
    void set_data(String name,int l_week,int h_rate)
    {
        this.name=name;
        this.l_week=l_week;
        this.h_rate=h_rate;
    }
    private int pay()
    {
        if(l_week<=40)
        {
          return l_week*h_rate;
        }
        else{
            int temp=l_week-40;
            return temp*(h_rate/2)+(40*h_rate);
        }
    }
  
    void show()
    {
        System.out.println("Income for last week of "+this.name+" : "+pay());
    }
    static income init(income in)
    {
        Scanner sc=new Scanner(System.in);
        in=new income();
        System.out.println("Enter data for "+(++income.c)+" employee:");
        System.out.println("Enter name of employee:");
        String i=sc.nextLine();
        System.out.println("Enter last week working time:");
        int j=sc.nextInt();
        System.out.println("Enter hour rate for this employe:");
        int k=sc.nextInt();
        in.set_data(i,j,k);
        return in;
    }
}
public class gross {
   
    public static void main(String args[])
    {
        income in[]=new income[3];
        in[0]=income.init(in[0]);
        in[1]=income.init(in[1]);
        in[2]=income.init(in[2]);
        in[0].show();
        in[1].show();
        in[2].show();

    }
    
}
