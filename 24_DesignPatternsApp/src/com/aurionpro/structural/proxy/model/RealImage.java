package com.aurionpro.structural.proxy.model;

public class RealImage implements IImage {
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
		
	}
}
