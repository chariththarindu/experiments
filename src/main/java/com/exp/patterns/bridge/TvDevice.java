package com.exp.patterns.bridge;

public class TvDevice extends EntertainmentDevice {

	
	public TvDevice() {
		super();
		
	}

	@Override
	public void buttonfivePressed() {
		System.out.println("button five pressed.....");
		
	}

	@Override
	public void buttonsixPressed() {
		System.out.println("button six pressed.....");
		
	}

}
