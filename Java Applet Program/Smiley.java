import java.applet.*;
import java.awt.*;

public class Smiley extends Applet
{
   public void paint(Graphics g)
   {
       g.setColor(Color.yellow);
       g.fillOval(30,30,200,200);
       g.setColor(Color.black);
       g.fillOval(90,70,15,15);
       g.fillOval(155,70,15,15);
       g.drawArc(83,150,92,30,180,180);

   }
}
/*<applet code="Smiley.class" width=300 height=300></applet>*/