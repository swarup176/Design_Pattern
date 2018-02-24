package com.observerDP;

import java.util.Observable;
import java.util.Observer;

public class Receiver1 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof Source) {
			System.out.println("Receiver1 received "+ (String)arg);
		}
	}

	
}
