class Animal
{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breeathe");
    }
}
class Fish extends Animal{

}
public class inheritance
{
    public static void main(String args[])
    {
        Fish shark=new Fish();
        shark.breathe();
        shark.eat();
    }
}