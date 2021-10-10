package shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	private int dimensionX;
	private int dimensionY;
	private int width;
	private int height;
	private Color sColor;
	protected double area;
	
	public Shape() {
		
	}
	
	/**
	 * @return the dimensionX
	 */
	public int getDimensionX() {
		return this.dimensionX;
	}
	/**
	 * @param dimensionX the dimensionX to set
	 */
	public void setDimensionX(int dimensionX) {
		this.dimensionX = dimensionX;
	}
	/**
	 * @return the dimensionY
	 */
	public int getDimensionY() {
		return dimensionY;
	}
	/**
	 * @param dimensionY the dimensionY to set
	 */
	public void setDimensionY(int dimensionY) {
		this.dimensionY = dimensionY;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the sColor
	 */
	public Color getsColor() {
		return sColor;
	}
	/**
	 * @param sColor the sColor to set
	 */
	public void setsColor() {
		this.sColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return this.area;
	}
	
	abstract public void draw(Graphics g);
	abstract public void setArea();	
}