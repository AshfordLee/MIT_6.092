// Circle.java - 圆形精灵
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Circle implements Sprite {
    private int radius;
    private Color color;
    
    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    
    public void draw(Graphics surface, int x, int y) {
        surface.setColor(color);
        surface.fillOval(x, y, radius * 2, radius * 2);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x, y, radius * 2, radius * 2);
    }
    
    public int getWidth() {
        return radius * 2;
    }
    
    public int getHeight() {
        return radius * 2;
    }
}