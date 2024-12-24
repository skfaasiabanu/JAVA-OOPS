public class Static{
    public static void main(String args[])
    {
         Student s1=new Student();
         s1.schoolname="hij";
         System.out.println(s1.schoolname);
         System.out.println(s1.marks(10,20,30));
         Student s2=new Student();
         System.out.println(s2.schoolname);
         System.out.println(s2.marks(20,20,30));
         Student s3=new Student();
         s3.schoolname="jhk";
         System.out.println(s3.marks(30,20,30));
         System.out.println(s3.schoolname);
    }
}
class Student
{
    String name;
    int rollno;
    static String schoolname;
    static int marks(int a,int b,int c)
    {
        return a+b+c;
    }
}