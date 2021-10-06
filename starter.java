import pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

public class starter implements InputControl, InputKeyControl {
	static int bal=100;
	static int flag=0;
	static boolean ba=false;
	static boolean bb=false;
	static boolean bc=false;
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
		if(!bb&&(!s.equals("aws"))) {
			boolean boole = false;
			Scanner sc = new Scanner(System.in);
			switch(ss) {
				case "a":
					bb=true;s=new String("bad");
					while((!boole)){
						System.out.println("Wager amount(you have "+bal+" tokens)");
						int ia = sc.nextInt();
						sc.nextLine();
						if(ia>bal||ia<0) {
							System.out.println("That's not within your budget!");
						}
						else if(ia<=bal){
							bal -= ia;
							boole=true;
						}
					}
					flag = 1;
				break;
				case "b":
					bb=true;s=new String("bad");
					flag = 3;
				break;
				case "c":
					bb=true;s=new String("bad");
					flag = 5;
				break;
			}
		}
		if(bb == true&&(!s.equals("bad"))) {
			switch(flag) {
				case 1:
				flag++;
				break;
				case 3:
				flag++;
				break;
				case 5:
				flag++;
				break;
			}
		}
	}
}
