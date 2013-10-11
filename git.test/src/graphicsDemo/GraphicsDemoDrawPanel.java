package graphicsDemo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GraphicsDemoDrawPanel extends JPanel{

	int xCoordinate;
	int yCoordinate;
	
	Color drawColor;
	
	//Constructor
	public GraphicsDemoDrawPanel() {
		//White background
		setBackground(Color.white);
		
		//Random color and coordinates for the initial drawing
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		drawColor = new Color(r, g, b);
		
		xCoordinate = rand.nextInt(350) + 1;
		yCoordinate = rand.nextInt(100) + 1;
		
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
	
		//Draw filled red oval
		g.setColor(drawColor);
		g.drawOval(xCoordinate, yCoordinate, 10, 10);
		g.fillOval(xCoordinate, yCoordinate, 10, 10);
		
	}
	
	//When called new coordinates for the oval are generated
	public void setNewCoordinates() {
		Random rand = new Random();
		
		//Random coordinates
		xCoordinate = rand.nextInt(350) + 1;
		yCoordinate = rand.nextInt(100) + 1;
		
	}
	
	//When called a new color is generated randomly
	public void setDrawingColor() {
		Random rand = new Random();
		
		//Random primary colors
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		drawColor = new Color(r, g, b);
		
	}
	
	//Used for giving new coordinates for the oval with mouse click
	public void setNewCoordinatesWithMouse(int x, int y) {
			
		//Mouse coordinates
		xCoordinate = x;
		yCoordinate = y;
		
		//new random color
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		drawColor = new Color(r, g, b);
		
	}
	

}
