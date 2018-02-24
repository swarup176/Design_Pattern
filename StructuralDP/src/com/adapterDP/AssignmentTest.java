package com.adapterDP;

public class AssignmentTest {
	public static void main(String[] args) {
		
		Assignment ass = new Assignment();
		ass.setP(new PenAdapter());
		ass.write("I am too tired to write");
	}

}
