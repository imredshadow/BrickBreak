package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!
	private int x;
	private int y;
	private int height;
	private int speed;
	
	//constructor(s):
	public Paddle(int x, int y, int height, int speed) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.speed = speed;
	}

	//methods:
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getYpos() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setXVelocity(int x) {
		this.xVelocity = x;
	}

	public void setYVelocity(int y) {
		this.yVelocity = y;
	}

	public void reverseX() {
		xVelocity *= -1;
	}

	public void reverseY() {
		yVelocity *= -1;
	}

	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}

	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	
	
}
