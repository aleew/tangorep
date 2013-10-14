package invokerGame;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InvokerGameMain implements ActionListener{

	InvokerGameFrame invokerGameFrame;
	JButton playButton;
	
	public InvokerGameMain() {
		invokerGameFrame = new InvokerGameFrame();
		
		invokerGameFrame.setLayout(new GridBagLayout());
		
		/*playButton = new JButton("Play!");
		playButton.addActionListener(this);
		
		invokerGameFrame.add(playButton);*/
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		if(command.equals("Play!")) {
			invokerGameFrame.removeAll();
			invokerGameFrame.setStartGame();
		}
		
	}
	
}
