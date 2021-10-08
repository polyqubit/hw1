import pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

public class starter implements InputControl, InputKeyControl {
	static int bal=100;
	static int flag=0;
	static int uiuo=0;
	static boolean ba,bb,bc,bd,be = false;
	static boolean slotA,slotB,slotC = false;
	
	static EasyReader e=new EasyReader();
	static gui g;
	static Text t;
	static String ss=new String("");
	static Rectangle wa;
	
	public static void main(String args[]) {
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		g = new gui();
		g.startscreen();
	}

	public void onMouseClick(double x, double y) {
		// enter code here
		if(bc==true) {
			switch(flag) {
				case 1:
				g.slotsscreen();
				bc = false;
				slotA = true;
				break;
				case 3:
				
				break;
				case 5:
				
				break;
				default:
				break;
			}
		}
		int randq;
		int slotAR,slotBR,slotCR;
		if(slotA==true) {
			randq = (int) Maths.rand(10);
			slotAR = g.randomslot(130,randq);
			slotA=false;
			slotB=true;
		}
		if(slotB==true) {
			randq = (int) Maths.rand(10);
			slotBR = g.randomslot(300,randq);
			slotB=false;
			slotC=true;
		}
		if(slotC==true) {
			randq = (int) Maths.rand(10);
			slotCR = g.randomslot(470,randq);
			slotA=false;
		}
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
					bb=true;bc=true;s=new String("bad");
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
					System.out.println("Now return to the other screen and click!");
					flag = 1;
				break;
				case "b":
					bb=true;bc=true;s=new String("bad");
					flag = 3;
				break;
				case "c":
					bb=true;bc=true;s=new String("bad");
					flag = 5;
				break;
			}
		}
	}
}
