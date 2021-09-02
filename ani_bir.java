class Animal{
    void eat()
    {
        System.out.println("Eat of Animal");
    }
    void sleep()
    {
        System.out.println("Sleep of Animal");
    }
}
class Bird extends Animal{
    void fly()
    {
        System.out.println("Fly of Bird");
    }
    void eat()
    {
        System.out.println("Eat of Bird");
    }
    void sleep()
    {
        System.out.println("Sleep of Bird");
    }
}
public class ani_bir {
    public static void main(String args[])
    {
        Animal A=new Animal();
        Bird B=new Bird();
        A.eat();
        A.sleep();
        B.eat();
        B.sleep();
        B.fly();
    }
}
