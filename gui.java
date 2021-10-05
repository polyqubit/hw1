import pkg.*;
import java.util.ArrayList;

public class gui {
	private Text ta;
	private Text tb;
	private Text tc;
	private Text td;
	private Text te;
	private Text tf;
	private Rectangle ra;
	private Rectangle rb;
	private Rectangle rc;
	private Rectangle rd;
	private Rectangle re;
	private Rectangle rf;
	private Rectangle rg;
	private Rectangle rh;
	private Rectangle ri;
	private Ellipse ea;
	private Ellipse eb;
	private Color ca;
	private Color cb;
	private Color cc;
	
	public void startscreen(String s) {
		ra = new Rectangle(0,0,1000,1000);
		ca = new Color(210,210,250);
		ra.setColor(ca);
		ra.fill();
		ta = new Text(80,10,"Welcome to the casino! Press a,b,c to play");
		tb = new Text(100,70,"Slots, PLACEHOLDER, or PLACEHLDER!");
		ta.draw();
		tb.draw();
		if(s.equals("a")){
			ca=new Color(250,210,210);
			ra.setColor(ca);
			ra.fill();
		}
		else if(s.equals("b")){
			ca=new Color(210,250,210);
			ra.setColor(ca);
			ra.fill();
		}
		else if(s.equals("c")){
			ca=new Color(250,210,250);
			ra.setColor(ca);
			ra.fill();
		}
	}
	public void gui(int flag) {
		switch(flag){
			case 0:
				
			break;
		}
	}
}