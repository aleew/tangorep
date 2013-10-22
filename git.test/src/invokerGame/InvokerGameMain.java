package invokerGame;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InvokerGameMain implements ActionListener, KeyListener{

	InvokerGameFrame invokerGameFrame;
	JButton playButton;
	InvokerGamePlayPanel invokerGamePlayPanel;
	JPanel playButtonPanel;
	
	InvokerGameAddSpells invokerGameAddSpells = new InvokerGameAddSpells();
	
	ArrayList<InvokerGameSpells> spells;
	
	public InvokerGameMain() {
		invokerGameFrame = new InvokerGameFrame();
		
		//invokerGameFrame.setLayout(new GridBagLayout());
		
		playButtonPanel = new JPanel();
		playButtonPanel.setLayout(new GridBagLayout());
		
		playButton = new JButton("Play!");
		playButton.addActionListener(this);
		
		playButtonPanel.add(playButton);
		invokerGameFrame.add(playButtonPanel);
		
		
		spells = invokerGameAddSpells.getSpells();
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		if(command.equals("Play!")) {
			//Remove starting screen
			invokerGameFrame.remove(playButton);
			invokerGameFrame.remove(playButtonPanel);
			
			
			//Add listener for keys
			invokerGameFrame.addKeyListener(this);
			invokerGameFrame.addNotify();
			
			//Make the playing board
			invokerGamePlayPanel = new InvokerGamePlayPanel();
			invokerGameFrame.add(invokerGamePlayPanel);
			
			//Paint new components
			invokerGameFrame.validate();
			invokerGameFrame.repaint();
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent evt) {
		
		//Get key char, convert to string and make it lowercase for easier comparison
		String key = Character.toString(evt.getKeyChar()).toLowerCase();
		
		//For 3 orbs
		if(key.equals("q")) {
			invokerGamePlayPanel.setNewOrbs(key);
		}
		
		else if(key.equals("w")) {
			invokerGamePlayPanel.setNewOrbs(key);
		}
		
		else if(key.equals("e")) {
			invokerGamePlayPanel.setNewOrbs(key);
		}
		
		//For invoking the spell
		else if(key.equals("r")) {
			String invokation = invokerGamePlayPanel.setNewInvokedSpell();
			
			for(int i = 0; i < spells.size(); i++) {
				String comparison = spells.get(i).getOrbCombination();
				
				if(comparison.equals(invokation)) {
					System.out.println(spells.get(i).getSpellName());
				}
				
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		
		
		
		
	}
	
}
