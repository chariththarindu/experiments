package com.exp.patterns.adapater;

public class TestAdapater {

	public static void main(String[] args) {
		
	 EnemyRobot robot = new EnemyRobot();
	 
	 EnemyRobotAdapter ad = new EnemyRobotAdapter(robot);
	 
	 ad.driveForward();
	 ad.fireWeapon();

	}

}
