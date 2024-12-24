public class abstractclass
{
    public static void main(String args[])
    {
          Horse h=new Horse();
          h.eat();
          h.walk();
          System.out.println(h.color);
          Chicken c=new Chicken();
          c.eat();
          c.walk();
    }
}
abstract class Animal
{
    //Abstract class constructor
    String color;
    Animal()
    {
        System.out.println("animal comnstructor");
        color="brown";
    }
    void eat()
    {
        System.out.println("eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse()
    {
        System.out.println("horse comnstructor");
    }
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Horse{
    Chicken()
    {
        System.out.println("chicken comnstructor");
    }
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}