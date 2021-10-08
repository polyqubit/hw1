import pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

public class starter implements InputControl, InputKeyControl {
	static int bal=100;
	static int flag=0;
	static int uiuo=0;
	static int slotAR = 9002;
	static int slotBR = 9003; //over 9000
	static int slotCR = 9004;
	static int ia=0;
	static int randq;
	static boolean gaming = false;
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
				gaming = true;
				break;
				case 3:
				
				break;
				case 5:
				
				break;
				default:
				break;
			}
		}
		if(gaming==true) {
			if(uiuo<2){
				uiuo++;
			}
			if((uiuo>1)&&(uiuo<4)) {
				randq = (int) Maths.rand(10);
				if(uiuo==2){
					slotAR = g.randomslot(130,randq);
				}
				uiuo++;
			}
			if((uiuo>3)&&(uiuo<6)) {
				randq = (int) Maths.rand(10);
				if(uiuo==4){
					slotBR = g.randomslot(300,randq);
				}
				uiuo++;
			}
			if((uiuo>5)&&(uiuo<8)) {
				randq = (int) Maths.rand(10);
				if(uiuo==6){
					slotCR = g.randomslot(470,randq);
				}
				uiuo++;
			}
			
			if((uiuo>6)&&(flag<10)&&(flag!=0)) {
				if((slotAR==slotBR)&&(slotAR==slotCR)&&(slotAR==7)) {
					System.out.println("actual gamer gamer\n");
					bal += ia * 25;
					System.out.println("Your balance now: "+bal);
					flag = 100;
				}
				else if((slotAR==slotBR)&&(slotAR==slotCR)) {
					System.out.println("gamer gamer\n");
					bal += ia * 10;
					System.out.println("Your balance now: "+bal);
					flag = 100;
				}
				else if((slotAR==slotBR)||(slotAR==slotCR)||(slotBR==slotCR)) {
					System.out.println("gamer");
					bal += ia * 2;
					System.out.println("Your balance now: "+bal);
					flag = 100;
				}
				else {
					System.out.println("not winner...\n");
					System.out.println("Your balance now: "+bal);
					flag = 100;
				}
			}
			if((flag==100)&&(bal>0)) {
				System.out.println("If you would like to play again, press 'y' in canvas.\n");
				be = true;
				flag=0;
				gaming = false;
			}
			else if(flag==100) {
				System.out.println("You lost!");
				g.interrupt();
				flag=0;
				gaming = false;
			}
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
						ia = sc.nextInt();
						sc.nextLine();
						if(ia>bal||ia<0) {
							System.out.println("That's not within your budget!");
						}
						else if(ia<=bal){
							bal -= ia;
							boole=true;
						}
					}
					System.out.println("Your balance now: "+bal);
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
		if((be == true)&&(s.equals("y"))) {
			System.out.println("Going again!");
			flag=0;
			uiuo=0;
			slotAR = 9002;
			slotBR = 9003; //over 9000
			slotCR = 9004;
			ia=0;
			gaming = false;
			ba = false;
			bb = false;
			bc = false;
			bd = false;
			be = false;
			slotA = false;
			slotB = false;
			slotC = false;
			g.startscreen();
		}
	}
}
