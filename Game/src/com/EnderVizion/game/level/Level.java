package com.EnderVizion.game.level;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}

	protected void generateLevel() {
	}

	protected void loadLevel(String path) {
	}

	public void update() {
	}

	//private void time() {
	//}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;

		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height) return Tile.generic_voidTile;
		if (tiles[x + y * width] == Tile.col_spawn_grass) return Tile.spawn_grass;
		if (tiles[x + y * width] == Tile.col_spawn_stone) return Tile.spawn_stone;
		if (tiles[x + y * width] == Tile.col_spawn_spawnWalls) return Tile.spawn_spawnWalls;
		if (tiles[x + y * width] == Tile.col_spawn_rflower) return Tile.spawn_grass_flower_red;
		if (tiles[x + y * width] == Tile.col_spawn_yflower) return Tile.spawn_grass_flower_yellow;
		if (tiles[x + y * width] == Tile.col_spawn_floor) return Tile.spawn_floor;
		if (tiles[x + y * width] == Tile.col_spawn_hedge) return Tile.spawn_hedge;
		if (tiles[x + y * width] == Tile.col_spawn_spawnPad) return Tile.spawn_spawnPad;
		if (tiles[x + y * width] == Tile.col_spawn_crackedWalls) return Tile.spawn_crackedWalls;
		return Tile.generic_voidTile;
	}
}

