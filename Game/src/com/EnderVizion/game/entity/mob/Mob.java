package com.EnderVizion.game.entity.mob;

import com.EnderVizion.game.entity.Entity;
import com.EnderVizion.game.graphics.Sprite;

public abstract class Mob extends Entity{
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving  = false;
	
	public void move(){
	}
	
	public void update(){
	}
	
	private boolean collision(){
		return false;
	}
	
	public void render(){
	}
}
