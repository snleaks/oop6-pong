package com.neumont.csc150.pong.model;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Ball {
	private Random r = new Random();
	private Color color;
	private int yDelta = 1;
	private int xDelta = 1;
	private int size;
	private Point position;
	
	public Ball(Point p){
		yDelta = r.nextInt(6) - 3;
		if(yDelta == 0)
			yDelta++;
		xDelta = r.nextInt(6) - 3;
		if(xDelta == 0)
			xDelta++;
		color = new Color(200, 200, 200);
		position = new Point(p);
		size = 10;
	}
	
//	public Ball(int size){
//		color = new Color(200, 200, 200);
//		position = new Point();
//		this.size = size;
//	}

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

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
}
