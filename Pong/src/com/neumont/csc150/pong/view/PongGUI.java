package com.neumont.csc150.pong.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.neumont.csc150.pong.model.Ball;
import com.neumont.csc150.pong.model.Paddle;
import com.neumont.csc150.pong.model.PongGame;

public class PongGUI extends JPanel implements ActionListener, KeyListener{

	private PongGame game;
	private Ball ball;
	private Paddle humanPaddle, computerPaddle;
	private int humanScore, computerScore;
	private boolean wPressed, sPressed;
	
	public PongGUI(){
		setBackground(Color.BLACK);
		
		addKeyListener(this);
		
		Timer timer = new Timer(5, this);
		timer.start();
	}
	
	public void move(){
		
		int humanYDelta = this.humanPaddle.getYDelta();
		int humanSpeed = this.humanPaddle.getSpeed();
		int humanPaddleHeight = this.humanPaddle.getHeight();
		
		if(wPressed){
			if(humanYDelta - humanSpeed > 0){
				humanYDelta -= humanSpeed;
			}
		}
		if(sPressed){
			if(humanYDelta + humanSpeed + humanPaddleHeight < humanPaddleHeight){
				humanYDelta += humanSpeed;
			}
		}
		else{
			//computer logic here
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W){
			wPressed = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			sPressed = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W){
			wPressed = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			sPressed = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		move();
	}

}
