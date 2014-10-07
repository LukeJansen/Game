package com.EnderVizion.game.entity.projectile;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;

public class ShirukenProjectile extends Projectile{
	
	public static int FIRE_RATE = 10; // Higher is slower.

	public ShirukenProjectile(int x, int y, double dir) {
		super(x, y, dir);
		range = 200;
		speed = 4;
		damage = 20;
		sprite = Sprite.projectile_shiruken;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update(){
		move();
		if (level.tileCollision(x, y, nx, ny, 15)) remove();
	}
	
	protected void move(){
		x += nx;
		y += ny;
		if (distance() > range) remove();
	}
	
	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
		return dist;
	}

	public void render(Screen screen){
		screen.renderProjectile((int)x - 12, (int)y -2 , this);
	}
}