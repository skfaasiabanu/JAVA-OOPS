public class Basic
{
    public static void main(String args[])
    {
        Pen p1=new Pen();//created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccount my_Accoun=new BankAccount();
        my_Accoun.userName="faasia";
        my_Accoun.setPassword("abc");
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String new_color)
    {
        color=new_color;
    }
    void setTip(int new_tip)
    {
        tip=new_tip;
    }
}
class BankAccount
{
    public String userName;
    private String password;
    public void setPassword(String new_password)
    {
        password=new_password;
    }
}