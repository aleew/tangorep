package aleew;

import java.awt.FlowLayout;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame {
	public HelloWorld()
	{
		this.setLayout(new FlowLayout());
		this.setSize(200,  200);
	/*	String envs = System.getenv().toString();
		envs = envs.replace(";", " \n"); */
	//	JLabel hell = new JLabel("Hello World!\n\n"+envs);
		JLabel hell = new JLabel("Hello World!");
		add(hell);
		this.setVisible(true);
	}	
}
