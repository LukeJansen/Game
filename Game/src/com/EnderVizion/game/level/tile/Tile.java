package com.EnderVizion.game.level.tile;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public Tile(Sprite sprite){
		this.sprite = sprite;
	}
	
	public void Render(int x, int y, Screen screen){
	}

	public boolean solid(){
		return false;
	}
}
