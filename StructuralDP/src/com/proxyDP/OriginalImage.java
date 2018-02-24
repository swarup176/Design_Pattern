package com.proxyDP;

public class OriginalImage implements Image {

	private String imageName;
	
	public OriginalImage(String imageName) {
		this.imageName=imageName;
		loadImage();
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying image " +imageName);
		
	}
	
	public void loadImage() {
		System.out.println("Loading Image "+imageName);
	}
}
