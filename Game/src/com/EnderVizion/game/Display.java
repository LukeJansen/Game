package com.EnderVizion.game;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static void main(String[] args){
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH,HEIGHT);
		frame.setResizable(false);
		frame.setVisible(true);		
	}

	@Override
	public void run() {
		
	}

}
