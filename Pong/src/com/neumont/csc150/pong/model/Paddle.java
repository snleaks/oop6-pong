package com.neumont.csc150.pong.model;

import java.awt.Color;
import java.awt.Point;

public class Paddle {
	private int yDelta = 2;
	private int height;
	private static int width = 20;
	
	public Paddle(){
		this.height = 60;
	}

	public int getyDelta() {
		return yDelta;
	}

	public void setyDelta(int yDelta) {
		this.yDelta = yDelta;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
