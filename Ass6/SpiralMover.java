// SpiralMover.java - 螺旋移动器
import java.awt.Graphics;

public class SpiralMover {
    private int x;
    private int y;
    private int centerX;
    private int centerY;
    private double angle;
    private double radius;
    private double radiusIncrement;
    private double angleIncrement;
    private Sprite sprite;
    
    public SpiralMover(int startX, int startY, Sprite sprite) {
        this.centerX = startX;
        this.centerY = startY;
        this.x = startX;
        this.y = startY;
        this.sprite = sprite;
        this.angle = 0;
        this.radius = 0;
        this.radiusIncrement = 0.5;
        this.angleIncrement = 0.1;
    }
    
    public void draw(Graphics surface) {
        sprite.draw(surface, x, y);
        
        // 更新螺旋位置
        angle += angleIncrement;
        radius += radiusIncrement;
        
        x = centerX + (int)(radius * Math.cos(angle));
        y = centerY + (int)(radius * Math.sin(angle));
    }
}