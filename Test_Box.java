import java.util.*;
class Box{
   private double depth;
   private double width;
   private double height;
   Box(double dep,double wid,double hg)
   {
       depth=dep;
       width=wid;
       height=hg;
   }
   double calc_volume()
   {
       return height*width*depth;
   }

}

class Test_Box{
    public static void main(String args[])
    {
        double dep,wid,hg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter height of the box: ");
        hg=sc.nextDouble();
        System.out.println("Enter width of the box: ");
        wid=sc.nextDouble();
        System.out.println("Enter depth of the box: ");
        dep=sc.nextDouble();

        Box T=new Box(dep,wid,hg);
        System.out.println("Volume of the box is : "+T.calc_volume());
    }

}