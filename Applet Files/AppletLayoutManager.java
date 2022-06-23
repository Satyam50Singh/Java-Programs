import java.awt.*;
import java.applet.*;

public class AppletLayoutManager extends Applet {
    public void init() {
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setLayout(new GridLayout(3, 3, 10, 10));

        // using Frame class
        // Frame frame = new Frame();
        // frame.add(b1);
        // frame.add(b2);
        // frame.add(b3);
        // frame.add(b4);
        // frame.add(b5);
        // frame.add(b6);
        // frame.add(b7);
        // frame.add(b8);
        // frame.setLayout(new GridLayout());
        // frame.setVisible(true);
        // frame.setSize(300, 300);

    }
}

/*<applet code="AppletLayoutManager.class" width=800 height=500></applet>*/