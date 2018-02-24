package com.proxyDP;

public class ProxyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImageProxy imageProxy=new ImageProxy("ABC.jpg");
		imageProxy.displayImage();
		ImageProxy imageProxy2=new ImageProxy("XYZ.jpg");
		imageProxy2.displayImage();
		imageProxy.displayImage();

	}

}
