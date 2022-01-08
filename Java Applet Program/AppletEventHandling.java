import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class AppletEventHandling extends Applet implements MouseListener
{
  StringBuffer strBuf;
  public void init()
  {
    addMouseListener(this);
    strBuf = new StringBuffer();
    additem("Initializing the applet");
    additem("Welcome to my program.");
  }
  public void start()
  {
    additem("starting the applet");
  }
  public void stop()
  {
    additem("Stoping the applet.");
  }
  public void destroy()
  {
    additem("Stoping the applet");
    additem("Good bye");
  }
  public void paint(Graphics g)
  {
    g.drawString(strBuf.toString(),10,20);
    setForeground(Color.white);
    setBackground(Color.black);
  }
  public void additem(String str)
  {
    System.out.println(str);
    strBuf.append(str);
    repaint();
  }
  public void mouseEntered(MouseEvent event)
  {}
  public void mouseExited(MouseEvent event)
  {}
  public void mousePressed(MouseEvent event)
  {}
  public void mouseReleased(MouseEvent event)
  {}
  public void mouseClicked(MouseEvent event)
  {
    additem("Mouse is clicked.");
  }
}

/*<applet code="AppletEventHandling" width="300" height="300"></applet>*/