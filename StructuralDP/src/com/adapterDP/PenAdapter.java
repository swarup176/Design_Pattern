package com.adapterDP;

public class PenAdapter  implements Pen{
	
	InkPen inkPen = new InkPen();

	@Override
	public void write(String str) {
		inkPen.mark(str);
		
	}

}
