import java.util.*;

class Rectangle{

    private double length;
    private double width;
    private double area;
    private String color;

    double set_length(double len)
    {
        length=len;
        return length;
    }
    double set_width(double wid)
    {
        width=wid;
        return width;
    }
    void find_area()
    {
        area=length*width;
    }
    String set_color(String col)
    {
        color=col;
        return color;
    }
    void show()
    {
        System.out.println("Length :"+length);
        System.out.println("Width :"+width);
        System.out.println("Color :"+color);
        System.out.println("Area :"+area);
    }
    static boolean check(Rectangle r1,Rectangle r2)
    {
        if(r1.area== r2.area && r1.color.equals(r2.color))
         return true;
        else return false;
    }
}

public class rec{

    static Rectangle init(Rectangle r)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length : ");
        r.set_length(sc.nextDouble());
        System.out.println("Enter width : ");
        r.set_width(sc.nextDouble());
        System.out.println("Enter color : ");
        r.set_color(sc.next());
        r.find_area();
        return r;
    }
    
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("Enter Data for first Rectangle : ");
        r1=init(r1);
        System.out.println("Enter Data for second Rectangle : ");
        r2=init(r2);
        System.out.println("Details of first Rectangle : ");
        r1.show();
        System.out.println("Details of second Rectangle : ");
        r2.show();
        System.out.println("");
        if(Rectangle.check(r1,r2))
        System.out.println("Matching Rectangles");
        else
        System.out.println("Non Matching Rectangles");
    }
}