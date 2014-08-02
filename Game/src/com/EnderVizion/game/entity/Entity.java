package com.EnderVizion.game.entity;

import java.util.Random;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.level.Level;

public class Entity {
	
	public int x,y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update(){
	}
	
	public void render(Screen screen){		
	}
	
	public void remove(){
		//Remove from level!
		removed = true;
	}
	
	public boolean isRemoved(){
		return removed;
	}
}
