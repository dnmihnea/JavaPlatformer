package main;

import javax.swing.JFrame;

public class GameWindow{
	private JFrame jframe;
	public GameWindow(GamePanel gamePanel) {
		
		jframe = new JFrame(); //create window
		
		jframe.setSize(400, 400); //set window height and width in pixels
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate windows when you click close
		jframe.add(gamePanel); //add panel to window
		jframe.setVisible(true); //make window visible
		
	}
}
