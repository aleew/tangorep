package test;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.awt.AWTUtilities;

public class Test extends JFrame{

	public Test() {
		setSize(400, 400);
		setLayout(new GridBagLayout());
			
		
		
		setUndecorated(true);
		AWTUtilities.setWindowOpacity(this, 0.5f);
		JPanel panel = new JPanel();
		
		JButton b1 = new JButton("jeebutton");
		panel.add(b1);
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
	}

}
