public class interface
{
    public static void main(String args[])
    {

    }
}
interface Chessplayer
{
    void moves();//we cannot write implementation here
}
class Queen  implements Chessplayer{
public void moves()
{
    System.out.println("up,down,left,right,diagonal");

}
}
class King  implements Chessplayer{
public void moves()
{
    System.out.println("up,down,left,right");
    
}
}