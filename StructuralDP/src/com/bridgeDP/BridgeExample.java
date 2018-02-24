package com.bridgeDP;

public class BridgeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TV crttv=new CRTTV();
		Remote crtRemote=new CRTRemote(10);
		crtRemote.setTv(crttv);
		
		crtRemote.nextChannel();
		crtRemote.previousChannel();
		crtRemote.display();
		
		TV ledtv=new LEDTV();
		Remote ledRemote=new LEDRemote(20);
		ledRemote.setTv(ledtv);
		ledRemote.display();
		((LEDRemote)ledRemote).setProgram();
		ledRemote.nextChannel();
	}

}
