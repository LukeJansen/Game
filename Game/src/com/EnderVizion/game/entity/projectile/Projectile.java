package com.EnderVizion.game.entity.projectile;

import com.EnderVizion.game.entity.Entity;
import com.EnderVizion.game.graphics.Sprite;

public abstract class Projectile extends Entity {
	
	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double x, y;
	protected double nx, ny;
	protected double distance;
	protected double speed, rateOfFire, range, damage;
	
	public Projectile(int x, int y, double dir){
		xOrigin = x;
		yOrigin = y;
		angle = dir;
		this.x = x;
		this.y = y;
	}
	
	public Sprite getSprite(){
		return sprite;
	}
	
	public int getSpriteSize(){
		return sprite.SIZE;
	}
	protected void move(){
	}

}
