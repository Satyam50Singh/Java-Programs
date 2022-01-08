import java.applet.*;
import java.awt.*;

public class ListApplet extends Applet
{
	List city;	
	public void init()
	{
		city=new List();
		city.setBounds(30,30,90,200);
		city.add("DELHI");
		city.add("KOLKATA");
		city.add("BANGALORE");
		city.add("CALCUTA");
		city.add("PATNA");
		city.add("CHENNAI");
		city.add("DEHRADUN");
		
		city.remove("PATNA");
		add(city);
	}
}


/*<applet code="ListApplet.java" width=300 height=300></applet>*/