import java.awt.*;

public class Square extends Rect{
    private int s;

    public Square(Point initPos, Color col, int side){
        super(initPos, col, side, side);
        s = side;
    }
    @Override
    public void draw(Graphics g) {	// A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,s, s);

    }
}
