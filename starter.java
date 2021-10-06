import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	static double bal=100;
	static int flag=0;
	static boolean ba=false;
	static EasyReader e=new EasyReader();
	static gui g;
	static Text t;
	static String ss=new String("");
	
	public static void main(String args[]) {
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		g = new gui();
		g.startscreen();
		
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here
		if(ba == false&&(s.equals("a")||s.equals("b")||s.equals("c"))) {
			g.gameload(s);
			ba = true;
			ss = s;
			s = new String("aws");
		}
		if(ba == true&&(!s.equals("aws"))) {
			switch(ss) {
				case "a":
				break;
				case "b":
				break;
				case "c":
				break;
			}
		}
		
		//System.out.print(ss);
	}
}
