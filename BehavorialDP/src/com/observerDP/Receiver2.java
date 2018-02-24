package com.observerDP;

import java.util.Observable;
import java.util.Observer;

public class Receiver2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof Source) {
			System.out.println("Receiver2 received "+ (String)arg);
		}
	}

	
}
