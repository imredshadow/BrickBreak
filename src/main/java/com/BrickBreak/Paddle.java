package com.BrickBreak;
//Jian Acol
//Creates the paddle and makes its instance variables, constructor, and mehtods like moving

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!
	private int x;
	private int y;
	private int height;
	private int width;
	private int velocity;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//methods:
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getVelocity() {
		return velocity;
	}

	public void addVelocity(int y) {
		this.velocity += y;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	//Draws the paddle using rectangle and color
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillRect(x, y, width, height);
	}
	//Moves the paddle based on the velocity variable
	public void move() {
		x += velocity;
	}

	
	
}
