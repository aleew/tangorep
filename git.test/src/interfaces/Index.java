package interfaces;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame implements ActionListener{

	//Initialize buttons
	private JButton btn1 = new JButton("Button1");
	private JButton btn2 = new JButton("Button2");
	private JButton btn3 = new JButton("Button3");
	private JButton btn4 = new JButton("Button4");
	
	//Initialize label
	private JLabel msgLabel = new JLabel();
	
	//Constructor
	public Index() {
		super("Main window"); //Header for the window
		this.setLayout(new FlowLayout()); //Window layout
		
		//Add buttons and listeners for them
		this.add(btn1);
		btn1.addActionListener(this);
		this.add(btn2);
		btn2.addActionListener(this);
		this.add(btn3);
		btn3.addActionListener(this);
		this.add(btn4);
		btn4.addActionListener(this);
		
		this.add(msgLabel);
		
		//Window size
		this.setSize(200, 200);
		
		//When window is closed the application closes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		
		//Handling the pressing of buttons
		if(command.equals("Button1")) {
			msgLabel.setText("Button1 pressed");
		}
		
		else if(command.equals("Button2")) {
			msgLabel.setText("Button2 pressed");
		}
		
		else if(command.equals("Button3")) {
			msgLabel.setText("Button3 pressed");
		}
		
		else if(command.equals("Button4")) {
			msgLabel.setText("Button4 pressed");
		}
		
	}
	
	public static void main(String[] args) {
		Index indexWindow = new Index();
		
		//Make window visible
		indexWindow.setVisible(true);
	}


}

