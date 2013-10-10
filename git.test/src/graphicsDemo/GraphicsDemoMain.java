package graphicsDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphicsDemoMain extends JFrame implements ActionListener{

	// Initialize panel
	private GraphicsDemoDrawPanel graphicsDemoDrawPanel = new GraphicsDemoDrawPanel();

	// Timer
	Timer timer = new Timer();

	// Initialize buttons
	private JButton coordinatesButton = new JButton("New coordinates");
	private JButton colorButton = new JButton("New color");
	private JButton goHamButton = new JButton("GO HAM!");
	
	public GraphicsDemoMain() {
		super.setTitle("Graphics demo");
		
		// JPanel for buttons
		JPanel buttonBar = new JPanel();

		// Add buttons and listeners for them
		buttonBar.add(coordinatesButton);
		coordinatesButton.addActionListener(this);
		buttonBar.add(colorButton);
		colorButton.addActionListener(this);
		buttonBar.add(goHamButton);
		goHamButton.addActionListener(this);

		// Add JPanels to JFrame
		add(buttonBar, BorderLayout.NORTH);
		add(graphicsDemoDrawPanel, BorderLayout.CENTER);
		
		this.setSize(400, 200);
		
		this.setResizable(false);
		
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		//Handling the pressing of buttons
		if(command.equals("New coordinates")) {
			
			//Timer is cancelled and purged when new button is pressed
			timer.cancel();
			timer.purge();
			
			graphicsDemoDrawPanel.setNewCoordinates();
			repaint();
		}
		
		else if(command.equals("New color")) {
			
			//Timer is cancelled and purged when new button is pressed
			timer.cancel();
			timer.purge();
			graphicsDemoDrawPanel.setDrawingColor();
			repaint();
		}
		
		else if(command.equals("GO HAM!")) {
			
			//Timer is cancelled and purged when new button is pressed
			timer.cancel();
			timer.purge();
			
			//Reinitialize timer
			timer = new Timer();
			
			//Timer runs in 200ms intervals and generates
			//new coordinates and color for the drawing
			timer.scheduleAtFixedRate(new TimerTask(){

				@Override
				public void run() {

					graphicsDemoDrawPanel.setDrawingColor();
					graphicsDemoDrawPanel.setNewCoordinates();
					repaint();
					
				}
				
			},200, 200);
		}
		
	}

}
