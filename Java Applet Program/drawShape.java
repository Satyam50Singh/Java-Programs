import java.applet.Applet;
import java.awt.*;

public class drawShape extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello World",12,12);
		g.setColor(Color.red);
		g.drawRect(30,20,150,100);
		g.fillRect(190,20,80,80);
		g.drawOval(30,140,130,130);
		g.fillOval(180,140,130,130);
		g.setColor(Color.black);
		g.drawArc(30,280,130,130,130,130);
		g.fillArc(130,280,130,130,130,130);
	}
}

/*<applet code="drawShape.class" width=500 height=500></applet>*/