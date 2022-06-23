import java.awt.*;
import java.applet.*;

public class EmojiApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW); 
        g.fillOval(20, 20, 150, 150);
        g.setColor(Color.black);
        g.fillOval(50, 60, 15, 25); // eye 1
        g.fillOval(120, 60, 15, 25); // eye 2
        int x[] = {95, 85, 106, 95};
        int y[] = {85, 104, 104, 85};
        g.drawPolygon(x, y, 4); // nose
        g.drawArc(55, 95, 78, 50, 0, -180); // smile
        g.drawLine(50, 126, 60, 116); //smile arc 1
        g.drawLine(128, 115, 139, 126);// smile arc 2
    }
}

/**
    <applet code="EmojiApplet.class" width="500" height="500"></applet>
 */