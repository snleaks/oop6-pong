package com.neumont.csc150.pong.model;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Ball {
	private Random r = new Random();
	private int yDelta = 1;
	private int xDelta = 1;
	private int size;
	
	public Ball(){
		yDelta = r.nextInt(6) - 3;
		if(yDelta == 0)
			yDelta++;
		xDelta = r.nextInt(6) - 3;
		if(xDelta == 0)
			xDelta++;
		size = 10;
	}

	public int getyDelta() {
		return yDelta;
	}

	public void setyDelta(int yDelta) {
		this.yDelta = yDelta;
	}

	public int getxDelta() {
		return xDelta;
	}

	public void setxDelta(int xDelta) {
		this.xDelta = xDelta;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
