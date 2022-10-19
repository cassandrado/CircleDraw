import java.awt.*;

public class Rect extends Shape{

    private int h;
    private int w;


    public Rect(Point initPos, Color col, int height, int width){
        super(initPos, col);
        h = height;
        w = width;
    }
    @Override
    public void draw(Graphics g) {	// A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,h, w);
    }

}
