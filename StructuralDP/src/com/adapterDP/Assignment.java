package com.adapterDP;

public class Assignment {
  
	private Pen p; 

	public void write(String str) {
		p.write(str);
		
		
	}

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

}
