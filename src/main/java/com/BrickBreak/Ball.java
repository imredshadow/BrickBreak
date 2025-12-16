//Jian Acol
//Creates the Ball class and its instance variables, constructors, and methods.

package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	//constructor(s):
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	//methods:
	public int getXpos() {
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

	//Changes the x direction of the ball from whatever it was moving
	public void reverseX() {
		xVelocity *= -1;
	}

	//Changes the y direction of the ball from whatever it was moving

	public void reverseY() {
		yVelocity *= -1;
	}


	//Draws the ball using an oval and a color
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}

	//Changes the x and y based on the respective velocity variable.
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}


}
