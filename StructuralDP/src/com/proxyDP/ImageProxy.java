package com.proxyDP;

public class ImageProxy implements Image{

	private String imageName;
	private Image image;
	
	public ImageProxy(String imageName) {
		this.imageName=imageName;
	}

	@Override
	public void displayImage() {
		
		if(image==null) {
			image=new OriginalImage(imageName);
		}
		image.displayImage();
	}
	
	
}
