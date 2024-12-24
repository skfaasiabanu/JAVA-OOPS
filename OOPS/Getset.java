public class Getset
{
    public static void main(String args[])
    {
        Pen p1=new Pen();
        p1.setColr("pink");
        System.out.println(p1.getColr());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    String getColr()
    {
        return color;
    }
    int getTip()
    {
        return tip;
    }
    void setColr(String new_color)
    {
        this.color=new_color;
    }
    void setTip(int tip)
    {
        this.tip=tip;
    }
}