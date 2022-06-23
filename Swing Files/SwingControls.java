import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingControls extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2;
    JTextField tlf;
    SwingControls() {
        setLayout(new FlowLayout());
        
        tlf = new JTextField(30);
        add(tlf);
        b1 = new JButton("Press Me");
        add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Press Me (b2)");
        add(b2);
        b2.addActionListener(this);

        l1 = new JLabel();
        add(l1);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            l1.setText("b1 Clicked ::: " + tlf.getText());    
        } else {
            l1.setText("b2 Clicked");    
        }
    }
    public static void main(String[] args) {
        SwingControls sc = new SwingControls();
        sc.setVisible(true);
        sc.setSize(400, 400);
        sc.setTitle("Swing Controls");
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
