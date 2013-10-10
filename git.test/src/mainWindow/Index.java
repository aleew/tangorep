package mainWindow;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import aleew.HelloWorld;
import graphicsDemo.GraphicsDemoMain;

public class Index extends JFrame implements ActionListener{

	public Index() {
		super.setTitle("Main window");
		
		//Panels for the window
		JPanel welcomeText = new JPanel();
		JPanel buttonBar = new JPanel();
		
		//Header for the window
		JLabel welcomeLabel = new JLabel("Live or Die...Make Your Choice");
		welcomeText.add(welcomeLabel);
		
		//Buttons
		JButton graphicsDemoButton = new JButton("Graphics demo");
		graphicsDemoButton.addActionListener(this);
		buttonBar.add(graphicsDemoButton);
		
		//Add new buttons here...
		
		JButton helloWorld = new JButton("Hello world!");
		helloWorld.addActionListener(this);
		buttonBar.add(helloWorld);
		
		//JPanels to JFrame
		add(welcomeText, BorderLayout.NORTH);
		add(buttonBar, BorderLayout.CENTER);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		//Code for the button presses
		if(command.equals("Graphics demo")) {
			GraphicsDemoMain graphicsDemo = new GraphicsDemoMain();
			//graphicsDemo.setVisible(true);
			
			
		}
		
		//new button press handlers here
		//else if...
		else if(command.equals("Hello world!")) {
			HelloWorld hello = new HelloWorld();
			hello.setVisible(true);
		}
		
		
		//here
	}
	
	public static void main(String[] args) {
		//Create the window
		Index mainWindow = new Index();
		
		//Window size
		mainWindow.setSize(400, 200);
		
		//Don't allow resizing
		mainWindow.setResizable(false);
		
		//Close application if this window is closed
		mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Set window visible
		mainWindow.setVisible(true);
		
		
	}

	
}
