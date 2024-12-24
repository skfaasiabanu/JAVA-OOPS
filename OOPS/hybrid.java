class Animal{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathe");
    }
}
class Fish extends Animal{
    int wings;
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
public class hybrid
{
    public static void main(String args[])
    {
        Dog d1=new Dog();
        d1.color="balck";
        System.out.println(d1.color);
        d1.eat();
        d1.breathe();
        d1.legs=7;
        System.out.println(d1.legs);
        d1.breed="dog";
        System.out.println(d1.breed);

    }
}