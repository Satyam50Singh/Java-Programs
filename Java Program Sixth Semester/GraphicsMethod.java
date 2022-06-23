import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class GraphicsMethod extends Applet {
    public void paint(Graphics g) {
        // public abstract void drawString(String str, int x, int y): is used to draw the specified string.
        g.drawString("Hello World!", 10, 18);
        // public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
        g.drawRect(10, 22, 60, 40);
        // public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
        g.fillRect(10, 64, 60, 40);
        // public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
        g.drawOval(10, 106, 50, 50);
        // public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
        g.fillOval(10, 158, 60, 50);
        // public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
        g.drawLine(10, 215, 200, 215);
        // public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.

        // public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
        g.drawArc(10, 218, 100, 100, 45, 90);
        // public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
        g.fillArc(10, 250, 100, 100, 0, 90);
        // public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
        g.setColor(Color.red);
        g.drawString("Hello World in Red Color", 10, 352);
        // public abstract void setFont(Font font): is used to set the graphics current font to the specified font.
    }
}

/**
<applet code="GraphicsMethod.class" width="400" height="400"></applet> */