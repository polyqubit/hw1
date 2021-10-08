import pkg.*;
import java.util.ArrayList;

public class gui extends Thread {
	private Text ta,tb,tc,td,te,tf,tg,th,ti,tj;
	private Rectangle ra,rb,rc,rd,re,rf,rg,rh,ri;
	private Ellipse ea,eb;
	private Color ca,cb,cc;
	public void gui(int flag) {
		switch(flag){
			case 99:
			break;
			default:
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
					tb = new Text(250,280,"Press any key, then wager in console!");
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
	public void slotsscreen() {
		ra = new Rectangle(0,0,1000,1000);
		rb = new Rectangle(80,210,100,100);
		rc = new Rectangle(250,210,100,100);
		rd = new Rectangle(420,210,100,100);
		ca = new Color(240,210,210);
		cb = new Color(228,177,62);
		ra.setColor(ca);
		rb.setColor(cb);
		rc.setColor(cb);
		rd.setColor(cb);
		ra.fill();
		rb.fill();
		rc.fill();
		rd.fill();
		ta = new Text(280,80,"Click to stop the slots!");
		tb = new Text(300,250,"?");    //use
		tc = new Text(470,250,"?");    //use
		td = new Text(130,250,"?");
		ta.grow(280,80);
		tb.grow(30,40);
		tc.grow(30,40);
		td.grow(30,40);
		ta.draw();
		tb.draw();
		tc.draw();
		td.draw();
	}
	public int randomslot(int x, int randInp) {
		rb = new Rectangle(80,210,100,100);
		cb = new Color(228,177,62);
		rb.setColor(cb);
		rb.fill();
		ta = new Text(x,650,"0");    //plus 400y to get into play area
		tb = new Text(x,650,"1");
		tc = new Text(x,650,"2");
		td = new Text(x,650,"3");
		te = new Text(x,650,"4");
		tf = new Text(x,650,"5");
		tg = new Text(x,650,"6");
		th = new Text(x,650,"7");
		ti = new Text(x,650,"8");
		tj = new Text(x,650,"9");
		ta.grow(30,40);
		tb.grow(30,40);
		tc.grow(30,40);
		td.grow(30,40);
		te.grow(30,40);
		tf.grow(30,40);
		tg.grow(30,40);
		th.grow(30,40);
		ti.grow(30,40);
		tj.grow(30,40);
		ta.draw();
		tb.draw();
		tc.draw();
		td.draw();
		te.draw();
		tf.draw();
		tg.draw();
		th.draw();
		ti.draw();
		tj.draw();
		
		switch(randInp) {
			case 0: case 10:
				ta.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 1:
				tb.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 2:
				tc.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 3:
				td.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 4:
				te.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 5:
				tf.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 6:
				tg.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 7:
				th.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 8:
				ti.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
			case 9:
				tj.setPosition(x,250);
				rb.setPosition(x-50,210);
			break;
		}
		
		return randInp;
	}
}