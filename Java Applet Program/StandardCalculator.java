import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StandardCalculator extends Applet
{
	Label l3,l1,l2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b100,b11,b12,b13,b14,b15,b16,b17,b18;
	JTextField f1;
	public void init()
	{
		f1=new JTextField();
		f1.setHorizontalAlignment(JTextField.RIGHT);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b100=new Button("00");
		b11=new Button("+");
		b12=new Button("-");
		b13=new Button("X");
		b14=new Button("/");
		b15=new Button("%");
		b16=new Button("C");
		b17=new Button(".");
		b18=new Button("=");
		
		l1=new Label("   Satyam Singh");
		l2=new Label(" BCA III-Semester");
		l3=new Label("S.G.R.R University");
		add(l1);
		add(l2);
		add(l3);
		add(f1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b100);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		
		setLayout(null);
		f1.setBounds(40,30,240,60);
		b16.setBounds(40,90,60,40);
		b17.setBounds(100,90,60,40);
		b15.setBounds(160,90,60,40);
		b14.setBounds(220,90,60,40);
		b7.setBounds(40,130,60,40);
		b8.setBounds(100,130,60,40);
		b9.setBounds(160,130,60,40);
		b13.setBounds(220,130,60,40);
		b4.setBounds(40,170,60,40);
		b5.setBounds(100,170,60,40);
		b6.setBounds(160,170,60,40);
		b12.setBounds(220,170,60,40);
		b1.setBounds(40,210,60,40);
		b2.setBounds(100,210,60,40);
		b3.setBounds(160,210,60,40);
		b11.setBounds(220,210,60,40);
		b10.setBounds(40,250,120,40);
		b100.setBounds(160,250,60,40);
		b18.setBounds(220,250,60,40);
		
		l1.setBounds(210,320,100,15);
		l2.setBounds(210,340,100,15);
		l3.setBounds(210,360,120,15);
		b1.addActionListener(new Calculate());
		b2.addActionListener(new Calculate());
		b3.addActionListener(new Calculate());
		b4.addActionListener(new Calculate());
		b5.addActionListener(new Calculate());
		b6.addActionListener(new Calculate());
		b7.addActionListener(new Calculate());
		b8.addActionListener(new Calculate());
		b9.addActionListener(new Calculate());
		b10.addActionListener(new Calculate());
		b100.addActionListener(new Calculate());
		b11.addActionListener(new Calculate());
		b12.addActionListener(new Calculate());
		b13.addActionListener(new Calculate());
		b14.addActionListener(new Calculate());
		b15.addActionListener(new Calculate());
		b16.addActionListener(new Calculate());
		b17.addActionListener(new Calculate());
		b18.addActionListener(new Calculate());
		
		//Colors
		setBackground(Color.black);
		setForeground(Color.white);
		f1.setForeground(Color.black);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l3.setBackground(Color.black);
		
		b16.setForeground(Color.WHITE);
		b18.setForeground(Color.WHITE);
		b16.setBackground(Color.RED);
		b18.setBackground(Color.blue);
	}
	
	public class Calculate implements ActionListener
	{
		public Float num1;
		public Float num2;
		int len;
		
		public void actionPerformed(ActionEvent e)
		{
			String str="";
			String s=f1.getText();
			if(e.getSource()==b1)
			{
				s=s+"1";
				f1.setText(s);				
			}
			else if(e.getSource()==b2)
			{
				s=s+"2";
				f1.setText(s);								
			}
			else if(e.getSource()==b3)
			{
				s=s+"3";
				f1.setText(s);								
			}
			else if(e.getSource()==b4)
			{
				s=s+"4";
				f1.setText(s);								
			}
			else if(e.getSource()==b5)
			{
				s=s+"5";
				f1.setText(s);								
			}
			else if(e.getSource()==b6)
			{
				s=s+"6";
				f1.setText(s);								
			}
			else if(e.getSource()==b7)
			{
				s=s+"7";
				f1.setText(s);								
			}
			else if(e.getSource()==b8)
			{
				s=s+"8";
				f1.setText(s);								
			}
			else if(e.getSource()==b9)
			{
				s=s+"9";
				f1.setText(s);								
			}
			else if(e.getSource()==b10)
			{
				s=s+"0";
				f1.setText(s);								
			}
			else if(e.getSource()==b100)
			{
				s=s+"00";
				f1.setText(s);								
			}
			else if(e.getSource()==b11)
			{
				s=s+"+";
				f1.setText(s);								
			}
			else if(e.getSource()==b12)
			{
				s=s+"-";
				f1.setText(s);								
			}
			else if(e.getSource()==b13)
			{
				s=s+"*";
				f1.setText(s);								
			}
			else if(e.getSource()==b14)
			{
				s=s+"/";
				f1.setText(s);								
			}
			else if(e.getSource()==b15)
			{
				s=s+"%X";
				f1.setText(s);								
			}
			else if(e.getSource()==b16)
			{
				s="";
				f1.setText(s);
			}
			else if(e.getSource()==b17)
			{
				s=s+".";
				f1.setText(s);
			}
			else if(e.getSource()==b18)
			{
				int len1=0;
				String temp=s;
				char ch='A';
				for(int i=0; i<temp.length(); i++)
				{
					char cha='+',chs='-',chm='*',chd='/',chp='%';
					ch=temp.charAt(i);
					if(ch==cha || ch==chs || ch==chm || ch==chd || ch==chp)
					{						
						break;
					}
					else
						len1++;
				}

				for(int j=0; j<len1; j++)
					str=str+s.charAt(j);
				num1=Float.valueOf(str).floatValue();
				
				str="";
				if(ch=='%')
				{
				for(int i=len1+2; i<s.length(); i++)
						str=str+s.charAt(i);					
				}
				else{
				for(int i=len1+1; i<s.length(); i++)
						str=str+s.charAt(i);
				}
				num2=Float.valueOf(str).floatValue();
						
				if(ch=='+')
				{
					num1=num1+num2;
					s=Float.toString(num1);
					f1.setText(s);
				}
				else if(ch=='-')
				{
					num1=num1-num2;
					s=Float.toString(num1);
					f1.setText(s);
				}
				else if(ch=='*')
				{
					num1=num1*num2;
					s=Float.toString(num1);
					f1.setText(s);
				}
				else if(ch=='/')
				{
					num1=num1/num2;
					s=Float.toString(num1);
					f1.setText(s);
				}
				else if(ch=='%')
				{
					num1=(num1/100)*num2;
					s=Float.toString(num1);
					f1.setText(s);
				}
			}			
		}
	}
}

/*<applet code="StandardCalculator.class" width=400 height=400></applet>*/