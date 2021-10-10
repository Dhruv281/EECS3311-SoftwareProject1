package shape;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends Shape {
	int dimensionX;
	int dimensionY;
	int width;
	int height;
	
	public MyRectangle(int fLocation) {
		super();
		
		dimensionX = fLocation * 70;
		setDimensionX(dimensionX);
		
		dimensionY = fLocation * 70;
		setDimensionY(dimensionY);
		
		width = (int)(Math.random() * 65) + 5;
		setWidth(width);
		
		height = (int)(Math.random() * 65) + 5;
		setHeight(height);
		
		setsColor();
		setArea();
		
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.getsColor());
		g.fillRect(this.getDimensionX(), this.getDimensionY(), this.getWidth(), this.getHeight());
	}
	
	@Override
	public void setArea() {
		// TODO Auto-generated method stub
		this.area = this.getWidth() * this.getHeight();
	}
}
