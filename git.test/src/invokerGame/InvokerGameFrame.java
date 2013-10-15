package invokerGame;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InvokerGameFrame extends JFrame implements ActionListener, KeyListener{

	
	public InvokerGameFrame() {
		super.setTitle("Invoker game");

		addKeyListener(this);
		
		this.setResizable(false);
		
		this.setSize(600, 400);
		
		this.setVisible(true);
		
			
	}
	
	public void addNotify() {
		super.addNotify();
		requestFocus();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
	
	}

}
