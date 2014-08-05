package com.EnderVizion.game.entity.projectile;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;

public class ShirukenProjectile extends Projectile{

	public ShirukenProjectile(int x, int y, double dir) {
		super(x, y, dir);
		speed = 2;
		range = 200;
		damage = 20;
		sprite = Sprite.spawn_grass;
		rateOfFire = 15;
		nx = speed * Math.cos(angle);
		nx = speed * Math.sin(angle);
	}
	
	public void update(){
		move();
	}
	
	protected void move(){
		x += nx;
		y += ny;
	}
	
	public void render(Screen screen){
		screen.renderTile(x, y, sprite);
	}
}
