//Base class
class Animal{
    String color;
    void eat()
    {
        System.out.println("eat");
    }
    void breathe()
    {
        System.out.println("breath");
    }
}
//derived class1
class Mammal extends Animal
{
    int legs;
}
class Fish extends Animal{
    int wings;
}
class Bird extends Animal{
    String type;
}
public class hierarchial
{
    public static void main(String args[])
    {
        Fish f1=new Fish();
        f1.eat();
        f1.breathe();
        f1.wings=8;
        System.out.println(f1.wings);
    }
}