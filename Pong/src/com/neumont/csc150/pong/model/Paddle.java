package com.neumont.csc150.pong.model;

import java.awt.Color;
import java.awt.Point;

public class Paddle {
	private Color color = new Color(200, 200, 200);
	private int yDelta = 2;
	private int height;
	private static int width = 10;
	private Point position;
	
	//Possible overloaded constructor for custom games
	public Paddle(int height, Point p){
		this.height = height;
		position = new Point(p);
	}
	
	public Paddle(Point p){
		this.height = 75;
		position = new Point(p);
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

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
}
