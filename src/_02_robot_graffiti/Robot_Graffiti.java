package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		int robx = rob.getX();
		
		int roby = rob.getY();

		rob.setSpeed(300);
		rob.penDown();
		
		rob.move(200);
		rob.turn(180);
		rob.move(100);
		rob.turn(-90);
		rob.move(300);
		for (int i = 0; i<200; i++) {
			rob.turn(1);
			rob.move(1);
		}
		rob.moveTo(10, 10);
			}	

			
		}

