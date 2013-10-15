package invokerGame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InvokerGamePlayPanel extends JPanel{

	JLabel orb1;
	JLabel orb2;
	JLabel orb3;
	
	JLabel invokedSpell;
	
	public InvokerGamePlayPanel() {
		
		this.setLayout(new FlowLayout());
		orb1 = new JLabel("orb1");
		orb2 = new JLabel("orb2");
		orb3 = new JLabel("orb3");
		
		invokedSpell = new JLabel("Glorious invokation");
		
		this.add(orb1);
		this.add(orb2);
		this.add(orb3);
		
		this.add(invokedSpell);
		
	}
	
	public void setNewOrbs(String key) {
		orb1.setText(orb2.getText());
		orb2.setText(orb3.getText());
		orb3.setText(key);
	}
	
	public String setNewInvokedSpell() {
		String invokation = orb1.getText() + orb2.getText() + orb3.getText();
		
		invokedSpell.setText(invokation);
		
		return invokation;
	}
}
