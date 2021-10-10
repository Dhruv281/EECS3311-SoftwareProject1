package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
	
	private static ShapeFactory sFactory;
	public static List<Shape> sList;
	public static List<Shape> loadedShapeList;
	
	private ShapeFactory() {
		
	}
	
	protected static ShapeFactory getInstance() {
		if(sFactory == null) {
			sFactory = new ShapeFactory();
			return sFactory;
		}
		return sFactory;
	}
	
	public List<Shape> getShapes() {
		sList = new ArrayList<Shape>();
		for(int i = 1; i <= 6; i++) { 
			if((int)(Math.random()*3)+1 == 1) {
				this.sList.add(new MyRectangle(i));
			}
			else if((int)(Math.random()*3)+1 == 2) {
				this.sList.add(new MySquare(i));
			}
			else 
				this.sList.add(new MyCircle(i));
		}
		return this.sList;
		
	}
	
	public List<Shape> loadedShapes() {
		loadedShapeList = new ArrayList<Shape>();
		loadedShapeList = ShapeFactory.sList;
		return loadedShapeList;
	}
	
	public void paintComponent(Graphics g, List<Shape> sList) {
		Graphics2D g2d = (Graphics2D) g;
		g.clearRect(70, 70, 600, 600);
		
		this.sList = sList;	
		for(Shape s : sList) {
			s.draw(g2d);
		}
	}
	
}