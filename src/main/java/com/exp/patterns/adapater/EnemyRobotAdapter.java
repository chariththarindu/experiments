package com.exp.patterns.adapater;

public class EnemyRobotAdapter implements EnemyAttacker {
	EnemyRobot robot;
	 public EnemyRobotAdapter(EnemyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		robot.smash();
		
	}

	@Override
	public void driveForward() {
		robot.movement();
		
	}

}
