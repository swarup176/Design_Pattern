package com.Builder_pattern;

public class PCBuilderDemo {
	public static void main(String[] args) {
		PCBuilder pcBuilder = new PCBuilder();
		pcBuilder.setRam("4 GB");
		System.out.println( pcBuilder.buildPC());
	}
	
}
