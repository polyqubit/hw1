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
		g.startscreen(ss);
		// while(!ba){
			// if(ss.equals("a")||ss.equals("b")||ss.equals("c")){g.startscreen(ss);break;}
		// }
		while(true){if(ss.equals("b")){System.out.print(ss);break;}}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here
		ss = s;
		//System.out.print(ss);
	}
}
