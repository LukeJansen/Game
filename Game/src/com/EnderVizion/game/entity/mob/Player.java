package com.EnderVizion.game.entity.mob;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;
import com.EnderVizion.game.input.Keyboard;

public class Player extends Mob{
	
	private Keyboard input;
	
	public Player(Keyboard input){
		this.input = input;
	}

	public Player(int x, int y, Keyboard input){	
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void update(){
		int xa=0, ya=0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		
		if (xa != 0 || ya != 0) move(xa, ya);
	}
	
	public void render(Screen screen){
		int xx = x - 16;
		int yy = y - 16;
		screen.renderPlayer(xx, yy, Sprite.player);
	}
	
}

