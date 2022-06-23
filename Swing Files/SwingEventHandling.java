import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingEventHandling extends JFrame implements ActionListener{

    JButton jbtn;
    JLabel jlabel;
    int count = 0;
    SwingEventHandling() {
        setLayout(new FlowLayout());
        jbtn = new JButton("Click Me");
        jlabel = new JLabel();
        add(jbtn);  add(jlabel);
        jbtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        jlabel.setText( " Clicked ::" + count);
    }

    public static void main(String[] args) {
        SwingEventHandling frame = new SwingEventHandling();
        frame.setBounds(200, 150, 400, 400);
        frame.setTitle("Event Handling Swing");
        frame.setVisible(true);
    }
}