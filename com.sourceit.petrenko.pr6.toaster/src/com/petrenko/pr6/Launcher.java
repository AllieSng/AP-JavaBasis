package com.petrenko.pr6;

public class Launcher {
	
	public static void main(String[] args) {
	int width = 16;
	String color = "green";
	Toaster t = new Toaster(width, color);
	t.createTostedBread();
	}

}
