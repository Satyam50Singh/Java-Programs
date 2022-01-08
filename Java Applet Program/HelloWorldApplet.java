import java.applet.Applet;
import java.awt.*;
public class HelloWorldApplet extends Applet
{
  public void paint(Graphics g)
  {
    g.drawString("Hello World",10,20);
  }
}
/*<applet code="HelloWorldApplet.class" width="100" height="100">
  </applet>*/