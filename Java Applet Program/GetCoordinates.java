import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class GetCoordinates extends Applet implements MouseListener,MouseMotionListener
{
	int X,Y;
	String Str="";
	public void paint(Graphics g)
	{
		addMouseMotionListener(this);
		addMouseListener(this);
		g.fillOval(X,Y,10,10);
		g.drawString("("+X+","+Y+")",X+12,Y+12);
		g.drawString(Str,X-8,Y-8);
		setBackground(Color.red);
		setForeground(Color.white);
	}
	public void mouseEntered(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Entered.";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Exited.";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Pressed.";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Released.";
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Clicked.";
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Moved.";
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		X=e.getX();
		Y=e.getY();
		Str="Mouse Dragged.";
		repaint();
	}
}

/*<applet code="GetCoordinates.class" width=400 height=400></applet>*/