import java.awt.*;
import java.applet.*;

public class Smiley extends Applet {
    public void paint(Graphics g) {

        // first emoji
        g.setColor(Color.YELLOW);        
        g.fillOval(10, 10, 200, 200); // face shape
        g.setColor(Color.BLACK);
        g.fillOval(65, 55, 15, 15);
        g.fillOval(145, 55, 15, 15);
        g.drawArc(55, 105, 108, 50, 0, -180);

        // second emoji
        g.setColor(Color.YELLOW);
        g.fillOval(220, 10, 200, 200); // face shape
        g.setColor(Color.BLACK);
        g.fillOval(275, 55, 15, 15);
        g.fillOval(355, 55, 15, 15);
        g.drawArc(265, 105, 108, 50, 0, -180);

    }
}

/*<applet code="Smiley.class" width=800 height=400></applet>*/