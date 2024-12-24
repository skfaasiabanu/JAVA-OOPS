public class constrructors
{
 public static void main(String args[])
 {
     //Student s1=new Student("faasia");
     //System.out.println(s1.name);
     Student s1=new Student();
 }  
}
class Student{
    String name;
    int rollno;
    //Student(String name)
    //{
      //  this.name=name;
    //}
Student()
{
    System.out.println("coonstructors are executed:");
}
}