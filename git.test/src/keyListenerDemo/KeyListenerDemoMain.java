package keyListenerDemo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyListenerDemoMain extends JFrame implements KeyListener{

	Timer timer = new Timer();
	KeyEvent key;
	
	KeyListenerDemoDrawPanel drawPanel = new KeyListenerDemoDrawPanel();
	
	public KeyListenerDemoMain() {
		super.setTitle("KeyListener demo");
		addKeyListener(this);
			
		add(drawPanel, BorderLayout.CENTER);
		
		this.setSize(400, 200);
		
		this.setResizable(false);
		
		this.setVisible(true);
	}
	
	//Make it so that window has focus
	//Needed for KeyListener
	public void addNotify() {
		super.addNotify();
		requestFocus();
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		
		timer.cancel();
		timer.purge();
		key = e;
		
		timer = new Timer();
		
		//Set new coordinates with keys
		//drawPanel.setNewCoordinates(e);
		
		//Set the move direction of ball with keys 
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {

				drawPanel.setDirection(key);			
				repaint();
				
			}
			
		},50, 50);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}


}
