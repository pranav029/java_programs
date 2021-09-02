class maxi{
    public int a,b;
    maxi(int x,int y)
    {
        a=x;
        b=y;
    }
    public void show()
    {
        System.out.println("Value of a  : "+a);
        System.out.println("Value of b  : "+b);
    }
}

public class shivam_bhaiya
{
    public static maxi swap(maxi s)
    {
        int temp=s.a;
        s.a=s.b;
        s.b=temp;
        return s;
    }
    public static void main(String args[])
    {
        maxi shivam=new maxi(12,34);
        shivam.show();
        System.out.println("Swapping....");
        shivam=swap(shivam);
        shivam.show();
    }
}