package shape;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StarterMain extends JFrame {
	private static JFrame frame; // Frame
	private static JPanel panel;
	Graphics graphic;
	ShapeFactory sFactory;
	Sorting sSort;
	private List<Shape> list;
	
	public static void main(String[] args) {
		new StarterMain();
	}
	
	public StarterMain() {
		frame = new JFrame("Display the Shapes");
		panel = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(panel);
	    frame.setSize(600, 600);
	    frame.setLocationRelativeTo(null);
	    
		
		JButton load = new JButton();
		load.setText("Load Shapes");
		
		JButton sort = new JButton();
		sort.setText("Sort Shapes");


		panel.setLayout(new FlowLayout());
		panel.add(load);
		panel.add(sort);
		
		load.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				graphic = panel.getGraphics();
				
				sFactory = ShapeFactory.getInstance();
				list = sFactory.getShapes();
				sFactory.paintComponent(graphic, list);
			}
		});
		
		sort.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				graphic = panel.getGraphics();
				sFactory = ShapeFactory.getInstance();
				
				sSort = Sorting.getInstance();
				sSort.SortMethod(list);
				
				sFactory.paintComponent(graphic, sFactory.loadedShapes());
			}
		});
		
		frame.setVisible(true);
		
	}

}
