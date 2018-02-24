package com.bridgeDP;

public class LEDRemote extends CRTRemote{

	public LEDRemote(int channel) {
		super(channel);
		
	}
	
	public void setProgram() {
		System.out.println("Setting program for LED TV for channel "+channel);
	}
}
