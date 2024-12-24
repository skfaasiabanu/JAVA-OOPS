public class copycon
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="faasia";
        s1.roll=456;
        s1.password="abc";
         s1.marks[0]=100;
         s1.marks[1]=20;
         s1.marks[2]=90;
        //now me i have forgot my password then another object is created with all other properties of me same but the password not
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
       

    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //shallow copy
    /*Student(Student s1)
    { 
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    */
   Student(Student s1)
   {
    marks=new int[3];
    for(int i=0;i<3;i++)
    {
        this.marks[i]=s1.marks[i];
    }
   }
    Student()
    {
        marks=new int[3];
        System.out.println("constructor is executed");
    }
}