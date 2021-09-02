import java.util.*;
class Quadilateral{
     private  float x1,x2,x3,x4,y1,y2,y3,y4;
     void get_data(float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4)
     {
         this.x1=x1;
         this.x2=x2;
         this.x3=x3;
         this.x4=x4;
         this.y1=y1;
         this.y2=y2;
         this.y3=y3;
         this.y4=y4;
     }
    float first_side()
    {
        return x4-x1;
    }
    float second_side()
    {
        return y1-y2;
    }
    float third_side()
    {
        return x3-x2;
    }
    float forth_side()
    {
        return y4-y3;
    }
}
class Trapezoid extends Quadilateral{
    Trapezoid(float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4)
    {
        super.get_data(x1, x2, x3, x4, y1, y2, y3, y4);
    }
    private float height()
    {
        return second_side()*second_side()-(third_side()-first_side());
    }
    float area()
    {
        return 0.5*(third_side()-first_side())*height();
    }
}
class Parallelogram extends Trapezoid{
    Parallelogram(float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4)
    {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

}
class Rectangle extends Parallelogram{
    Rectangle(float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4)
    {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

}
class Square extends Parallelogram{
    Square(float x1,float x2,float x3,float x4,float y1,float y2,float y3,float y4)
    {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

}
public class quad {
    
}
