import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorApplet extends Applet implements ActionListener
{
	Label l1,l2,l3,l0;
	TextField f1,f2;
	JRadioButton r1,r2,r3,r4;
	Button b1;
	public float a,b,res;
	public void init()
	{ 	
		l0=new Label("APPLET CALCULATOR");
		l1=new Label("Enter 1st number :");
		l2=new Label("Enter 2nd number :");
		f1=new TextField();
		f2=new TextField();
		r1=new JRadioButton("Addition");
		r2=new JRadioButton("Subtraction");
		r3=new JRadioButton("Multiplication");
		r4=new JRadioButton("Division");
		l3=new Label("Result : ");
		setBackground(Color.black);
		setForeground(Color.white);
		
		setLayout(null);
		l0.setBounds(80,05,200,25);
		l1.setBounds(30,40,110,25);
		l2.setBounds(30,70,110,25);
		f1.setBounds(160,40,90,25);
		f2.setBounds(160,70,90,25);
		r1.setBounds(70,110,100,25);
		r2.setBounds(70,140,100,25);
		r3.setBounds(70,170,100,25);
		r4.setBounds(70,200,100,25);
		l3.setBounds(100,240,100,25);
		
		f1.setForeground(Color.black);
		f2.setForeground(Color.black);
		r1.setBackground(Color.gray);
		r2.setBackground(Color.gray);
		r3.setBackground(Color.gray);
		r4.setBackground(Color.gray);
		r1.setForeground(Color.black);
		r2.setForeground(Color.black);
		r3.setForeground(Color.black);
		r4.setForeground(Color.black);
		
		add(l0);
        	add(l1);
		add(l2);
		add(l3);
		add(f1);
		add(f2);
		add(r2);
		add(r1);
		add(r3);
		add(r4);

		ButtonGroup bg =new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		a=Float.parseFloat(f1.getText());
		b=Float.parseFloat(f2.getText());
		if(r1.isSelected())
		{
			res=a+b;
			l3.setText("Result : "+res);
		}
		else if(r2.isSelected())
		{
			res=a-b;
			l3.setText("Result : "+res);
		}
		else if(r3.isSelected())
		{
			res=a*b;
			l3.setText("Result : "+res);
		}
		else 
		{
			res=a/b;
			l3.setText("Result : "+res);
		}
	}
}

/*<applet code ="CalculatorApplet.class" width=400 height=350></applet>*/
