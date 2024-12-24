public class typesc
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student("faasia");
        Student s3=new Student(123);
    }
}
class Student
{
    String name;
    int tip;
    Student()
    {
        System.out.println("default constructor executed");
    }
    Student(String name )
    {
        this.name=name;
    }
    Student(int tip)
    {
        this.tip=tip;
    }

}