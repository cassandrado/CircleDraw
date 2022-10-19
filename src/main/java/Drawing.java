import java.awt.*;
import java.awt.event.*;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    Point p=new Point(200,200);
    Point p2=new Point(100,100);
    Point p3=new Point(150,50);


    Color c=new Color(0x901159);// The RGB number comprises three bytes: red, green and blue
    Color c2=new Color(0x159011);
    Color c3=new Color(0x119085);

    private Frame f;

    // The constructor
    public Drawing(){
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);		// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }
    public void paint(Graphics g){
        Circle c1 = new Circle(p,c, 60);
        c1.draw(g);

        Rect r1 = new Rect(p2,c2,40,60);
        r1.draw(g);

        Square s1 = new Square(p3,c3,40);
        s1.draw(g);


    }
}

