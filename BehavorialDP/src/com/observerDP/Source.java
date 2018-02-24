package com.observerDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class Source extends Observable implements Runnable {

	@Override
	public void run() {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String stringtoSend = null;
		while (true) {
			try {
				stringtoSend = bufferedReader.readLine();
				setChanged();
				notifyObservers(stringtoSend);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
