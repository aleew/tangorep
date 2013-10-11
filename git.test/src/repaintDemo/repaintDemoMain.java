package repaintDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import graphicsDemo.*;

public class repaintDemoMain extends JFrame implements ActionListener{

	JPanel buttonBar = new JPanel();
	JButton swapButton;
	JButton swapBackButton;
	
	public repaintDemoMain() {
		
		swapButton = new JButton("Swap");	
		buttonBar.add(swapButton);
		swapButton.addActionListener(this);
		
		this.add(buttonBar, BorderLayout.NORTH);
		
		//this.setResizable(false);
		this.setSize(400, 200);
		
		this.setVisible(true);		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		if(command.equals("Swap")) {		
			buttonBar.remove(swapButton);
			swapButton = new JButton("Swap back");
			swapButton.addActionListener(this);
			buttonBar.add(swapButton);
			validate();
			//repaint();	
		
		}
		
		else if(command.equals("Swap back")) {		
			buttonBar.remove(swapButton);
			swapButton = new JButton("Swap");
			swapButton.addActionListener(this);
			buttonBar.add(swapButton);
			validate();
			//repaint();
			
		}
		
		
	}
	
	public static void main(String[] args) {
		repaintDemoMain repaintDemo = new repaintDemoMain();
	}

	
}
