package com.EnderVizion.game.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.EnderVizion.game.level.tile.Tile;

public class SpawnLevel extends Level{

	private int[] levelPixels;
	
	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path){
		try{
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			tiles = new Tile[w * h];
			levelPixels = new int[w * h];
			image.getRGB(0, 0, w, h, levelPixels, 0, w);
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
			if (levelPixels[i] == 0xff404040) tiles[i] = Tile.stone;
			if (levelPixels[i] == 0xff00ff00) tiles[i] = Tile.grass;
			if (levelPixels[i] == 0xffff0000) tiles[i] = Tile.grass_flower_red;
			if (levelPixels[i] == 0xffffD800) tiles[i] = Tile.grass_flower_yellow;
		}
	}
}
