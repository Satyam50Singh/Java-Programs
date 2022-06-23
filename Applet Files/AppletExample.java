import java.awt.*;
import java.applet.*;

public class AppletExample extends Applet {
	public void init() {
		System.out.println("init");
	}
	public void start() {
		System.out.println("start");
	}
	public void paint(Graphics g) {
		g.drawString("Hello World", 10, 35);
	}
	public void stop() {
		System.out.println("stop");
	}
	public void destroy() {
		System.out.println("destroy");
	}
}

/* <applet code="AppletExample.class" width=200 height=200 > </applet> */