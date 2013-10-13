package keyListenerDemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;


public class KeyListenerDemoDrawPanel extends JPanel{
	
	int xCoordinate;
	int yCoordinate;
	Rectangle ball;
		
	Color drawColor;
	
	int foodX;
	int foodY;
	Rectangle food;
	
	int laskuri = 0;
	
	//Constructor
	public KeyListenerDemoDrawPanel() {
		//White background
		setBackground(Color.white);
		
		//Random color and coordinates for the initial drawing
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		drawColor = new Color(r, g, b);
		
		xCoordinate = 100;
		yCoordinate = 100;
		
		ball = new Rectangle(xCoordinate, yCoordinate, 10, 10);
		
		foodX = rand.nextInt(150) + 1;
		while(foodX >= 150 || foodX <= 50) {
			foodX = rand.nextInt(150) + 1;
		}
		
		foodY = rand.nextInt(150) + 1;
		while(foodY >= 150 || foodY <= 50) {
			foodY = rand.nextInt(150) + 1;
		}
		food = new Rectangle(foodX, foodY, 5, 5);
			
		if(xCoordinate == foodX && yCoordinate == foodY) {
			
			foodX = rand.nextInt(150) + 1;
			while(foodX >= 150 || foodX <= 50) {
				foodX = rand.nextInt(150) + 1;
			}
			
			foodY = rand.nextInt(150) + 1;
			while(foodY >= 150 || foodY <= 50) {
				foodY = rand.nextInt(150) + 1;
			}
		}
		
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
	
		//Draw filled red oval
		g.setColor(drawColor);
		g.drawOval(xCoordinate, yCoordinate, 10, 10);
		g.fillOval(xCoordinate, yCoordinate, 10, 10);
		//ball = new Rectangle(xCoordinate, yCoordinate, 10, 10);
		ball.setLocation(xCoordinate, yCoordinate);
		
		//Draw a box which shows bounds for the ball
		g.drawLine(50, 50, 160, 50);
		g.drawLine(50, 50, 50, 160);
		g.drawLine(50, 160, 160, 160);
		g.drawLine(160, 50, 160, 160);
		
		Random rand = new Random();
		
		g.drawOval(foodX, foodY, 5, 5);
		g.fillOval(foodX, foodY, 5, 5);
		//food = new Rectangle(foodX, foodY, 5, 5);
		food.setLocation(foodX, foodY);	
	}
	
	public void setNewCoordinates(KeyEvent e) {
		
		Random rand = new Random();
		
		//Handling of the arrow key presses
		//Move ball to the direction of the arrow and kkep the ball inside
		//of the specified bounds
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			//System.out.println("up");
			if(yCoordinate > 50)
				yCoordinate = yCoordinate - 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			//System.out.println("down");
			if(yCoordinate < 150)
				yCoordinate = yCoordinate + 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			//System.out.println("left");
			if(xCoordinate > 50)
				xCoordinate = xCoordinate - 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			//System.out.println("right");
			if(xCoordinate < 150)
				xCoordinate = xCoordinate + 1;
			
		}
		if(ball.intersects(food)) {
		//if(xCoordinate == foodX && yCoordinate == foodY) {
			foodX = rand.nextInt(150) + 1;
			while(foodX >= 150 || foodX <= 50) {
				foodX = rand.nextInt(150) + 1;
			}
		
			foodY = rand.nextInt(150) + 1;
			while(foodY >= 150 || foodY <= 50) {
				foodY = rand.nextInt(150) + 1;
			}
			laskuri++;
			System.out.println("" + laskuri);
			
					
					
		}
			
	}
	
	public void setDirection(KeyEvent e) {
		
		Random rand = new Random();
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			//System.out.println("up");
			if(yCoordinate > 50)
				yCoordinate = yCoordinate - 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			//System.out.println("down");
			if(yCoordinate < 150)
				yCoordinate = yCoordinate + 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			//System.out.println("left");
			if(xCoordinate > 50)
				xCoordinate = xCoordinate - 1;
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			//System.out.println("right");
			if(xCoordinate < 150)
				xCoordinate = xCoordinate + 1;
			
		}
		
		if(ball.intersects(food)) {
			//if(xCoordinate == foodX && yCoordinate == foodY) {
				foodX = rand.nextInt(150) + 1;
				while(foodX >= 150 || foodX <= 50) {
					foodX = rand.nextInt(150) + 1;
				}
			
				foodY = rand.nextInt(150) + 1;
				while(foodY >= 150 || foodY <= 50) {
					foodY = rand.nextInt(150) + 1;
				}
				laskuri++;
				System.out.println("" + laskuri);
							
			}
	}

}
