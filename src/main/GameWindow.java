package main;

import javax.swing.JFrame;

public class GameWindow{
	private JFrame jframe;
	public GameWindow(GamePanel gamePanel) {
		
		jframe = new JFrame(); //create window
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate windows when you click close
		jframe.add(gamePanel); //add panel to window
		jframe.setLocationRelativeTo(null); //spawns window in the center of the screen
		jframe.setResizable(false);
		jframe.pack();
		jframe.setVisible(true); //make window visible
		
	}
}
