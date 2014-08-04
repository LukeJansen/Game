package com.EnderVizion.game.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.EnderVizion.game.level.tile.Tile;

public class SpawnLevel extends Level{
	
	private Tile[] tiles;
	private int[] levelPixels;
	
	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path){
		try{
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, levelPixels, 0, w);
			tiles = new Tile[w * h];
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("Couldn't load level file!");
		}
	}
	
	//Stone = 0x404040
	//Grass = 0x00FF00
	//RFlower = 0xFF0000
	//YFlower = 0xFFD800
	protected void generateLevel(){
		for (int i = 0; i < levelPixels.length; i++){
			if (levelPixels[i] == 0x404040) tiles[i] = Tile.stone;
			if (levelPixels[i] == 0x00FF00) tiles[i] = Tile.grass;
			if (levelPixels[i] == 0xFFFF00) tiles[i] = Tile.grass_flower_red;
			if (levelPixels[i] == 0x00FF00) tiles[i] = Tile.grass_flower_yellow;
		}
	}
}
