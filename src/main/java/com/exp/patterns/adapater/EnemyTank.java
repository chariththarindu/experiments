package com.exp.patterns.adapater;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
	
	Random ran = new Random();

	@Override
	public void fireWeapon() {
		System.out.println("enemy attack fire weapon :-" + ran.nextInt(10) + 1 + "damange");
		
	}

	@Override
	public void driveForward() {
		System.out.println("enemy attack drivew forward:-" + ran.nextInt(10) + 1 + "drive foraward");
		
	}

}
