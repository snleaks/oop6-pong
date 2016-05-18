package com.neumont.csc150.pong.controller;

import com.neumont.csc150.pong.model.Ball;
import com.neumont.csc150.pong.model.Paddle;
import com.neumont.csc150.pong.view.PongUIFactory;
import com.neumont.csc150.pong.view.PongUIInterface;

public class PongGame {
	
	private PongUIInterface ui = new PongUIFactory().createInstanceOf();
	private Ball b;
	private Paddle leftPaddle;
	private Paddle rightPaddle;

	
	
	public Ball getB() {
		return b;
	}

	public void setB(Ball b) {
		this.b = b;
	}

	public Paddle getLeftPaddle() {
		return leftPaddle;
	}

	public void setLeftPaddle(Paddle leftPaddle) {
		this.leftPaddle = leftPaddle;
	}

	public Paddle getRightPaddle() {
		return rightPaddle;
	}

	public void setRightPaddle(Paddle rightPaddle) {
		this.rightPaddle = rightPaddle;
	}
}
