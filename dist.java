import java.util.*;
import java.lang.Math;
class Distance{
    private double x1,y1,x2,y2;
    Distance(double x1,double y1,double x2,double y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    double calc_dist()
    {
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }
}
public class dist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of two points");
        Distance d=new Distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.printf("Distance between points : %.2f",d.calc_dist());
    }
}
