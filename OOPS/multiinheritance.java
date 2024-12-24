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
class Dog extends Mammal{
    String breed;
}
public class multiinheritance
{
    public static void main(String args[])
    {
        Dog doggy=new Dog();
        doggy.eat();
        doggy.legs=4;
        System.out.println(doggy.legs);
    }
}