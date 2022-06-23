// Event Handling Program using Applet

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class AppletEventHandling extends Applet implements ActionListener {

    Button button;
    TextField tfData;

    public void init() {

        tfData = new TextField();
        tfData.setBounds(35, 40, 160, 30);

        button = new Button("click me");
        button.setBounds(55, 80, 80, 30);    

        add(tfData);
        add(button);

        button.addActionListener(this);
        setLayout(null);
    }
    
    public void actionPerformed(ActionEvent ae) {
        tfData.setText("Event Triggered!");
    }
}

/* <applet code="AppletEventHandling.class" width=400 height=400></applet> */ 