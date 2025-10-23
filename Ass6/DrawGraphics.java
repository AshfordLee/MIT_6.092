import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    Bouncer movingSprite;
    StraightMover straightSprite;
    SpiralMover spiralSprite;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);

        // 直线移动的蓝色圆形
        Circle circle = new Circle(10, Color.BLUE);
        straightSprite = new StraightMover(50, 50, circle);
        straightSprite.setMovementVector(2, 3);

        // 螺旋移动的绿色矩形
        Rectangle spiralBox = new Rectangle(12, 12, Color.GREEN);
        spiralSprite = new SpiralMover(150, 150, spiralBox);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        movingSprite.draw(surface);
        straightSprite.draw(surface);
        spiralSprite.draw(surface);
    }
}
