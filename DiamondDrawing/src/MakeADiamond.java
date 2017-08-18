import java.util.Scanner;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;


public class MakeADiamond  implements Directions{
	Robot bobbie = new Robot(1,7,North,30);
	public static void main(String[] args) {
		MakeADiamond temp = new MakeADiamond();
		
		temp.prompt();
	}

	private void prompt() {
		// Ask the user for the diamond size
		System.out.println("Hey dude, I see you want to make a diamond.  Give me the deets: ");
		Scanner keyboard  = new Scanner(System.in);
		int beepersOnSide = keyboard.nextInt();
		System.out.println(beepersOnSide);
		World.setVisible(true);
		World.setDelay(5);
		World.setSize(15, 15);
		diamond(beepersOnSide);
		
	}


	private void diamond(int beepersOnSide) {
		// make the robot street 1, middle of diamond (corner)
		
		bobbie.putBeeper();
		bobbie.move();
		
		//bottom left side
		for(int i = 1; i<beepersOnSide; i++) {
			bobbie.turnLeft();
			bobbie.move();
			bobbie.putBeeper();
			turnRight();
			bobbie.move();
	
		}
		
		//top left side
		for(int i = 1; i<beepersOnSide-1; i++) {
			turnRight();
			bobbie.move();
			bobbie.putBeeper();
			bobbie.turnLeft();
			bobbie.move();
			
		}
		//top right side
		bobbie.turnLeft();
		bobbie.turnLeft();
		for(int i = 1; i<beepersOnSide+1; i++) {
			
			bobbie.turnLeft();
			bobbie.move();
			bobbie.putBeeper();
			turnRight();
			bobbie.move();
		}
		
		//bottom right side
		
		for(int i = 1; i<beepersOnSide-1; i++) {
			turnRight();
			bobbie.move();
			bobbie.putBeeper();
			bobbie.turnLeft();
			bobbie.move();
		}
		
	}
	
	

	private void turnRight() {
		bobbie.turnLeft();
		bobbie.turnLeft();
		bobbie.turnLeft();
	}
	private void drawSide(Robot r, int beepersOnSide) {
		
	}

}
