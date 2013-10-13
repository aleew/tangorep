package keyListenerDemo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import graphicsDemo.*;

public class KeyListenerDemoMain extends JFrame implements KeyListener{

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
			
		//Call the setting of new coordinates and repaint
		drawPanel.setNewCoordinates(e);
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}


}
