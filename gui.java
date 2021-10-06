import pkg.*;
import java.util.ArrayList;

public class gui {
	private Text ta,tb,tc,td,te,tf,tg;
	private Rectangle ra,rb,rc,rd,re,rf,rg,rh,ri;
	private Ellipse ea,eb;
	private Color ca,cb,cc;
	public void gui(int flag) {
		switch(flag){
			case 0:
				
			break;
		}
	}
	
	public void startscreen() {
		ra = new Rectangle(0,0,1000,1000);
		ca = new Color(210,210,250);
		ra.setColor(ca);
		ra.fill();
		ta = new Text(270,180,"Welcome to the casino! Press a, b, c to play");
		ta.grow(200,20);
		tb = new Text(270,270,"SLOTS, PLACEHOLDER, or PLACEHOLDER!");
		tb.grow(200,20);
		ta.draw();
		tb.draw();
	}
	public void gameload(String s) {
		switch(s){
				case "a":
					ra = new Rectangle(0,0,1000,1000);
					ca = new Color(250,210,250);
					ra.setColor(ca);
					ra.fill();
					ta = new Text(300,180,"SLOTS!");
					tb = new Text(250,280,"Press any key to play!");
					ta.grow(200,100);
					ta.draw();
					tb.draw();
				break;
				case "b":
					ra = new Rectangle(0,0,1000,1000);
					ca = new Color(250,250,210);
					ra.setColor(ca);
					ra.fill();
					ta = new Text(300,180,"PLACEHOLDER0!");
					tb = new Text(250,280,"Press any key to play!");
					ta.grow(280,80);
					ta.draw();
					tb.draw();
				break;
				case "c":
					ra = new Rectangle(0,0,1000,1000);
					ca = new Color(210,250,250);
					ra.setColor(ca);
					ra.fill();
					ta = new Text(300,180,"PLACEHOLDER1!");
					tb = new Text(250,280,"Press any key to play!");
					ta.grow(280,80);
					ta.draw();
					tb.draw();
				break;
		}
	}
	
	
}