package com.bridgeDP;

public abstract class Remote {

	protected TV tv;
	protected int channel;
	public abstract int nextChannel();
	public abstract int previousChannel();
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void display() {
		tv.displayChannel(channel);
	}
	
}
