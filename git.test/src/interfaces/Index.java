package interfaces;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

import jpanels.DrawCircleJPanel;

public class Index extends JFrame implements ActionListener{

	//Initialize panel
	private DrawCircleJPanel drawCircleJPanel = new DrawCircleJPanel();
	
	//Timer
	Timer timer = new Timer();
	
	//Initialize buttons
	private JButton coordinatesButton = new JButton("New coordinates");
	private JButton colorButton = new JButton("New color");
	private JButton goHamButton = new JButton("GO HAM!");
	
	//Constructor
	public Index() {
		super("Main window"); //Header for the window
		
		//JPanel for buttons	
		JPanel buttonBar = new JPanel();
		
		//Add buttons and listeners for them
		buttonBar.add(coordinatesButton);
		coordinatesButton.addActionListener(this);
		buttonBar.add(colorButton);
		colorButton.addActionListener(this);
		buttonBar.add(goHamButton);
		goHamButton.addActionListener(this);
		
		//Add JPanels to JFrame
		add(buttonBar, BorderLayout.NORTH);
		add(drawCircleJPanel, BorderLayout.CENTER);
			
		//When window is closed the application closes
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		//Handling the pressing of buttons
		if(command.equals("New coordinates")) {
			
			//Timer is cancelled and purged when new button os pressed
			timer.cancel();
			timer.purge();
			
			drawCircleJPanel.setNewCoordinates();
			repaint();
		}
		
		else if(command.equals("New color")) {
			
			//Timer is cancelled and purged when new button os pressed
			timer.cancel();
			timer.purge();
			drawCircleJPanel.setDrawingColor();
			repaint();
		}
		
		else if(command.equals("GO HAM!")) {
			
			//Timer is cancelled and purged when new button os pressed
			timer.cancel();
			timer.purge();
			
			//Reinitialize timer
			timer = new Timer();
			
			//Timer runs in 200ms intervals and generates
			//new coordinates and color for the drawing
			timer.scheduleAtFixedRate(new TimerTask(){

				@Override
				public void run() {

					drawCircleJPanel.setDrawingColor();
					drawCircleJPanel.setNewCoordinates();
					repaint();					
				}
				
			},200, 200);
		}

	}
	
	public static void main(String[] args) {
		Index indexWindow = new Index();
		
		//Window size
		indexWindow.setSize(400, 200);
		
		//Disable resizing of the window
		indexWindow.setResizable(false);
		
		//Make window visible
		indexWindow.setVisible(true);
	}


}

