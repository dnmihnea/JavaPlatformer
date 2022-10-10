package main;

import java.awt.Graphics;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{
	
	private KeyboardInputs keyboardInputs;
	private MouseInputs mouseInputs;
	
	private int xDelta = 100;
	private int yDelta = 100;

	public GamePanel() {
		
		keyboardInputs = new KeyboardInputs(this);
		mouseInputs = new MouseInputs(this);
		addKeyListener(keyboardInputs); //placed keyboard inputs in its own class
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	
	public void changeXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	
	public void changeYDelta(int value) {
		this.yDelta += value;
		repaint();
	}
	
	public void setRectPos (int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(xDelta, yDelta, 200, 50);
	}
}
