package com.exp.patterns.bridge;

public abstract class EntertainmentDevice {
	
	public int deviceState =0;
	
	private int volume=0;
	
	//public int maxSetting;
	
	public abstract void buttonfivePressed();
	public abstract void buttonsixPressed();
	
	public void deviceState() {
		
		if (deviceState !=0) {
			deviceState=1;
		}else  {
			deviceState=0;
		}
		System.out.println("device feed back:-" + deviceState);
	}
	
	public void buttonTwoPressed() {
		System.out.println("volume increased" + volume++);
		
		
	}

	public void buttonOnePressed() {
		System.out.println("volume decreased" + volume--);
		
	}
}
