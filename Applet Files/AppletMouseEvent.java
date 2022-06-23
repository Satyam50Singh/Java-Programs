import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletMouseEvent extends Applet implements MouseListener {

    String str = "";
    int X = 0;
    int Y = 0;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(str, X, Y);
    }

    public void mouseClicked(MouseEvent me) {
        str = "Mouse Clicked";
        X = 50; Y +=30;
        repaint();
    }
    public void mouseExited(MouseEvent me) {
        
    }
    public void mouseEntered(MouseEvent me) {
        
    }
    public void mousePressed(MouseEvent me) {
        
    }
    public void mouseReleased(MouseEvent me) {
        
    }
}

/**<applet code="AppletMouseEvent.class" width=400 height=400></applet> */