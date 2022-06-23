import java.applet.Applet;  
import java.awt.Graphics;  

public class BasicApplet extends Applet{  
  
    // this method is used to initialized the Applet. It is invoked only once.  
    public void init() { 
        System.out.println("Inside init()");
    }  
  
    // this method is invoked after the init() method or browser is maximized. It is used to start the Applet. 
    public void start(){  
        System.out.println("Inside start()");
    }  
  
    // this methodis used to paint the Applet. 
    // It provides Graphics class object that can be used for drawing oval, rectangle, arc etc.
    public void paint(Graphics g){   
        System.out.println("Inside paint()");
        g.drawString("welcome to applet",100,150);  
    }  
  
    // this method is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.
    public void stop(){  
        System.out.println("Inside stop()");
    }  
  
    // is used to destroy the Applet. It is invoked only once.
    public void destroy(){  
        System.out.println("Inside destroy()");
    }  
  
}  
/* 
<applet code="BasicApplet.class" width="300" height="300"> 
</applet> 
*/  