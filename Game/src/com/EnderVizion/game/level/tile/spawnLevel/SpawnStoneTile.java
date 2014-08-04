package com.EnderVizion.game.level.tile.spawnLevel;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;
import com.EnderVizion.game.level.tile.Tile;

public class SpawnStoneTile extends Tile {

	public SpawnStoneTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid(){
		return true;
	}
}
