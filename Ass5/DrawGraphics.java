import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // box = new BouncingBox(200, 50, Color.RED);
        boxes=new ArrayList<BouncingBox>();
        BouncingBox box1=new BouncingBox(60,60,Color.RED);
        box1.setMovementVector(1,0);

        BouncingBox box2=new BouncingBox(150,120,Color.BLUE);
        box2.setMovementVector(0,-2);

        BouncingBox box3=new BouncingBox(240,200,Color.GREEN);
        box3.setMovementVector(-1,1);

        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        // surface.drawLine(50, 50, 250, 250);
        // surface.drawArc(50,50,20,20,0,360);

        // surface.setColor(Color.BLUE);
        // surface.fillOval(50,50,100,100);
        
        for (BouncingBox box:boxes)
        {
            box.draw(surface);
        }


    }


} 