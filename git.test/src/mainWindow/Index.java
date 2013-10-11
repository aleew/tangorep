package mainWindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import aleew.HelloWorld;
import graphicsDemo.GraphicsDemoMain;
import keyListenerDemo.KeyListenerDemoMain;

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
		
		//Graphics demo
		JButton graphicsDemoButton = new JButton("Graphics demo");
		graphicsDemoButton.addActionListener(this);
		buttonBar.add(graphicsDemoButton);
		
		//Hello world
		JButton helloWorld = new JButton("Hello world!");
		helloWorld.addActionListener(this);
		buttonBar.add(helloWorld);
		
		//KeyListener demo
		JButton keyListenerDemo = new JButton("KeyListener demo");
		keyListenerDemo.addActionListener(this);
		buttonBar.add(keyListenerDemo);
		
		//Add new buttons here...
		
		//JPanels to JFrame
		add(welcomeText, BorderLayout.NORTH);
		add(buttonBar, BorderLayout.CENTER);

		//To ways to set the location for the window
		/*
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
	    setLocation(x, y);
		
	    //setLocationRelativeTo(null);
		*/	
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		//Graphics demo button is pressed
		if(command.equals("Graphics demo")) {
			GraphicsDemoMain graphicsDemo = new GraphicsDemoMain();
			//graphicsDemo.setVisible(true);
			
			
		}
		
		//Hello world button is pressed
		else if(command.equals("Hello world!")) {
			HelloWorld hello = new HelloWorld();
			hello.setVisible(true);
		}
		
		else if(command.equals("KeyListener demo")) {
			KeyListenerDemoMain keyListenerDemoMain = new KeyListenerDemoMain();
		}
		
		//new button press handlers here
		//else if...
		
		
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
