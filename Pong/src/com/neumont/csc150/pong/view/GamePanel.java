package com.neumont.csc150.pong.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.neumont.csc150.pong.controller.PongGame;

public class GamePanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private PongGame game;
	
	private int WINDOW_X;
	private int WINDOW_Y;
	
	Point ballPosition;
	Point leftPaddlePosition;
	Point rightPaddlePosition;
	
//	private int paddleSizeX = 20;
//	private int paddleSizeY = 60;
//	
//	private final int paddlePositionOffset = 50;
//	
//	private int paddle1Y = (WINDOW_Y / 2) - (paddleSizeY / 2);
//	private int paddle2Y = (WINDOW_Y / 2) - (paddleSizeY / 2);
//	
//	private int paddle1X = paddlePositionOffset;
//	private int paddle2X = ((WINDOW_X - paddleSizeX) - paddlePositionOffset);
	
	private int p1Move = 0;
	private int p2Move = 0;
	
	private int player1Delta = 4;
	private int player2Delta = 3;
	
	private Timer timer = new Timer(10, this);
	
	public GamePanel(int x, int y) {
		WINDOW_X = x;
		WINDOW_Y = y;
		ballPosition = new Point(WINDOW_X/2, WINDOW_Y/2);
		leftPaddlePosition = new Point(WINDOW_X/8, WINDOW_Y/2-30);
		rightPaddlePosition = new Point(WINDOW_X-100, WINDOW_Y/2-30);
		game = new PongGame();
		this.addKeyListener(this);
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(leftPaddlePosition.x, leftPaddlePosition.y,
				game.getLeftPaddle().getWidth(), game.getLeftPaddle().getHeight());
		g.fillRect(rightPaddlePosition.x, rightPaddlePosition.y, 
				game.getRightPaddle().getWidth(), game.getRightPaddle().getHeight());
		g.fillOval(ballPosition.x, ballPosition.y, game.getB().getSize(), game.getB().getSize());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		requestFocus(); // requesting focus for key events
		if (p1Move == -1) {
			this.leftPaddlePosition.y -= game.getLeftPaddle().getyDelta();
		}
		else if (p1Move == 1) {
			this.leftPaddlePosition.y += game.getLeftPaddle().getyDelta();
		}
		
		if (p2Move == -1) {
			this.rightPaddlePosition.y -= game.getRightPaddle().getyDelta();
		}
		else if (p2Move == 1) {
			this.rightPaddlePosition.y += game.getRightPaddle().getyDelta();
		}
		
		// Collision for paddle 1
		if (this.leftPaddlePosition.y >= (WINDOW_Y - this.leftPaddlePosition.y)) {
			this.leftPaddlePosition.y -= this.player1Delta;
		}
		
		if (this.leftPaddlePosition.y <= 0) {
			this.leftPaddlePosition.y += this.player1Delta;
		}
		
		// Collision for paddle 2
		if (this.rightPaddlePosition.y >= (WINDOW_Y - this.rightPaddlePosition.y)) {
			this.rightPaddlePosition.y -= this.player2Delta;
		}
		
		if (this.rightPaddlePosition.y <= 0) {
			this.rightPaddlePosition.y += this.player2Delta;
		}
		
		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent key) {
		if (key.getKeyCode() == 87) {
			p1Move = -1;
		}
		else if (key.getKeyCode() == 83) {
			p1Move = 1;
		}
	}

	@Override
	public void keyReleased(KeyEvent key) {
		if (key.getKeyCode() == 87) {
			p1Move = 0;
		}
		else if (key.getKeyCode() == 83) {
			p1Move = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent key) {
	}
}
