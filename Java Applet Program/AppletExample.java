import java.applet.Applet;
import java.awt.*;

public class AppletExample extends Applet
{
  public void init()
  {
    System.out.println("Applet is intialized.");
  }
  public void start()
  {
    System.out.println("Applet is being executed.");
  }
  public void paint(Graphics g)
  {
     g.drawString("HII I AM SATYAM SINGH \n HOW ARE YOU SIR ???",20,20);
  }
  public void stop()
  {
    System.out.println("Applet execution has stoped.");
  }
  public void destroy()
  {
    System.out.println("Applet has been destroyed.");
  }
}
/*<applet code="AppletExample" width="300" height="300"></applet>*/