package invokerGame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InvokerGamePlayPanel extends JPanel{

	JLabel orb1;
	JLabel orb2;
	JLabel orb3;
	
	JLabel newSpell;
	JLabel invokedSpell;
	
	public InvokerGamePlayPanel() {
		
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		gbl.preferredLayoutSize(this);
		GridBagConstraints c = new GridBagConstraints();
		this.setPreferredSize(new Dimension(600, 400));
		
		
		//For showing new spell
		newSpell = new JLabel("new spell");
		
		//For showing what user invoked
		invokedSpell = new JLabel("Glorious invokation");
		
		//For showing orbs
		orb1 = new JLabel("orb1");
		orb2 = new JLabel("orb2");
		orb3 = new JLabel("orb3");
		
		c.ipadx = 40;
		c.ipady = 40;
		
		//Add showing new spell to top and center
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 1;
		c.gridy = 0;
		this.add(newSpell, c);
		
		//Add showing orbs to middle row
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		this.add(orb1, c);
		
		c.gridx = 1;
		this.add(orb2, c);
		
		c.gridx = 2;
		this.add(orb3, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		this.add(invokedSpell, c);
		
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
