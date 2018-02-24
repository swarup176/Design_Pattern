package com.bridgeDP;

public class CRTRemote extends Remote {

	public CRTRemote(int channel) {
		this.channel=channel;
	}

	@Override
	public int nextChannel() {
		System.out.println("Next channel is "+(channel+1));
		return channel+1;
	}

	@Override
	public int previousChannel() {
		System.out.println("Previous channel is "+ (channel-1));
		return channel-1;
	}
	
}
