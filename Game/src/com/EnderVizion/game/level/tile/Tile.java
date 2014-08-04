package com.EnderVizion.game.level.tile;

import com.EnderVizion.game.graphics.Screen;
import com.EnderVizion.game.graphics.Sprite;

public class Tile {

	public int x, y;
	public Sprite sprite;
	
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_grass_flower_red = new SpawnFlowerTile(Sprite.spawn_grass_flower_red);
	public static Tile spawn_grass_flower_yellow = new SpawnFlowerTile(Sprite.spawn_grass_flower_yellow);
	public static Tile spawn_stone = new SpawnStoneTile(Sprite.spawn_stone);
	public static Tile spawn_spawnWalls = new SpawnWallsTile(Sprite.spawn_spawnWalls);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_spawnPad = new SpawnPadTile(Sprite.spawn_spawnPad);
	public static Tile spawn_crackedWalls = new SpawnWallsTile(Sprite.spawn_crackedWalls);
	
	public static final int col_spawn_grass = 0xFF00FF00;
	public static final int col_spawn_stone = 0xFF808080;
	public static final int col_spawn_spawnWalls = 0xFF404040;
	public static final int col_spawn_rflower = 0xFFFF0000;
	public static final int col_spawn_yflower = 0xFFFFD800;
	public static final int col_spawn_floor = 0xFF7F3300;
	public static final int col_spawn_hedge = 0xFF007F0E;
	public static final int col_spawn_spawnPad = 0xFF007B7F;
	public static final int col_spawn_crackedWalls = 0xFF303030;
	
	
	public static Tile generic_voidTile = new VoidTile(Sprite.generic_voidSprite);

	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {
	}

	public boolean breakable(){
		return false;
	}
	
	public boolean solid() {
		return false;
	}

}