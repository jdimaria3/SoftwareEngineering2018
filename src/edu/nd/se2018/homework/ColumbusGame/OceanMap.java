package edu.nd.se2018.homework.ColumbusGame;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OceanMap {
	boolean[][] oceanGrid = new boolean[25][25];
	final int dimensions = 25;
	
	//copied from guided part of assignment
	public void drawMap(ObservableList<Node> root, int scale) {
		for (int x = 0; x < dimensions; x++) {
			for (int y = 0; y < dimensions; y++) {
				Rectangle rect = new Rectangle(x * scale, y * scale, scale, scale);
				rect.setStroke(Color.BLACK);
				rect.setFill(Color.PALETURQUOISE);
				root.add(rect);
				oceanGrid[x][y] = false;
			}
		}
		
		//calls the draw islands function
		drawIslands(root, scale);
	}
	
	//function to add 10 random islands to the scene
	public void drawIslands(ObservableList<Node> root, int scale) {
		int x, y;
		
		for (int i = 0; i < 10; i++) {
			//generates a random x and y
			x = 0 + (int)(Math.random() * ((24 - 0) + 1));
			y = 0 + (int)(Math.random() * ((24 - 0) + 1));
			
			//Continuously generates random numbers until a combo that isn't already filled
			//with an island is found. Also prevents an island from spawning where the ship does
			while (oceanGrid[x][y] == true || (x != 15 && y != 15)) {
				x = 0 + (int)(Math.random() * ((24 - 0) + 1));
				y = 0 + (int)(Math.random() * ((24 - 0) + 1));
			}
			
			Rectangle rect = new Rectangle(x * scale, y * scale, scale, scale);
			rect.setStroke(Color.BLACK);
			rect.setFill(Color.GREEN);
			root.add(rect);
			oceanGrid[x][y] = true;
		}
	}
}
