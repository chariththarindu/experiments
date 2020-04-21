package com.exp.patterns.bridge;

public class TVRemoteMute  extends RemoteButton{

	public TVRemoteMute(EntertainmentDevice device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("Remote button nine pressed............");
		
	}

	
}
