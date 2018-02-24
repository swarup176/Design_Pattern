package com.observerDP;

import java.util.Observable;
import java.util.Observer;

public class ObserverExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Observable source = new Source();

		Observer receiver1 = new Receiver1();
		Observer receiver2 = new Receiver2();

		source.addObserver(receiver1);
		source.addObserver(receiver2);

		Thread thread = new Thread((Source) source);
		thread.start();
	}

}
