package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
	
		//2. create an array of 5 robots.
		Robot[] robot = new Robot[5];
		//3. use a for loop to initialize the robots.
		int robX = 100;
		for(int i = 0; i<robot.length;i++) {
			robot[i] = new Robot();
			robot[i].changeRobot("https://4.imimg.com/data4/GF/FM/MY-10106023/pooh-teddy-bear-500x500.jpg");
			robot[i].setY(250);
			robot[i].setX(robX+=100);
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 5
		Random r = new Random();
		boolean isRacing  = true;
	while (isRacing)	
		for( int x = 0; x< robot.length; x++) {
		//	robot[x].move(r.nextInt(10));
			if(r.nextInt(20) > 10) {
				robot[x].move(5);
				robot[x].turn(5);			}
		int x0 = 100+ (x*100);
			
			if(robot[x].getX()> x0-5 && robot[x].getX()<x0+5 && robot[x].getY()<260 && robot[x].getY()> 250) {
				isRacing = false;
				JOptionPane.showMessageDialog(null, "robot" + x +" is the winner");
			}
		}
		
			
		
		}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

}

