import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbers extends Applet implements ActionListener
{
  Label l1,l2,l3;
  TextField f1,f2,f3;
  Button b1;
  public void init()
  {
     l1= new Label("Enter 1st number :"); 
     l2= new Label("Enter 2nd number :"); 
     l3= new Label();
     b1= new Button("Add");
     f1= new TextField(); 
     f2= new TextField(); 
     setLayout(null);
     l1.setBounds(30,30,120,25);
     l2.setBounds(30,70,120,25);
     f1.setBounds(150,30,100,25);
     f2.setBounds(150,70,100,25);
     b1.setBounds(90,120,90,30);
     l3.setBounds(90,190,100,25);
     
     add(l1);
     add(f1);
     add(l2);
     add(f2);
     add(b1);
     add(l3);
     b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
     int a,b;
     a=Integer.parseInt(f1.getText());  
     b=Integer.parseInt(f2.getText());
     l3.setText("Sum is : "+(a+b));  
  }
}

/*<applet code ="AddTwoNumbers" width =350 height =300></applet>*/