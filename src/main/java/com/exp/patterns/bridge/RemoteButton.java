package com.exp.patterns.bridge;

public abstract class RemoteButton {

	private EntertainmentDevice device;

	public RemoteButton(EntertainmentDevice device) {
		super();
		this.device = device;
	}
	

	public void buttonfivePressed() {
		System.out.println("Remote button five pressed.....");
		device.buttonfivePressed();
	}

	
	public void buttonsixPressed() {
		System.out.println("Remote button six pressed.....");
		device.buttonsixPressed();
	}
	
	public abstract void buttonNinePressed();
	
}
