package edu.nd.se2018.homework.ColumbusGame;

import java.awt.Point;

public class Ship {

	Point currentLocation = new Point();
	
	public Ship() {
		currentLocation.x = 15;
		currentLocation.y = 15;
	}
	
	public Point getShipLocation() {
		return currentLocation;
	}

	//checks whether this would move it off the grid east or if there is an island in the way
	public void goEast(boolean[][] oceanGrid) {
		// TODO Auto-generated method stub
		if (currentLocation.x < 24 && oceanGrid[currentLocation.x + 1][currentLocation.y] != true) {
			currentLocation.x = currentLocation.x + 1;
		}
	}

	//checks whether this would move it off the grid west or if there is an island in the way
	public void goWest(boolean[][] oceanGrid) {
		// TODO Auto-generated method stub
		if (currentLocation.x > 0 && oceanGrid[currentLocation.x - 1][currentLocation.y] != true) {
			currentLocation.x = currentLocation.x - 1;
		}
	}

	//checks whether this would move it off the grid north or if there is an island in the way
	public void goNorth(boolean[][] oceanGrid) {
		// TODO Auto-generated method stub
		if (currentLocation.y > 0 && oceanGrid[currentLocation.x][currentLocation.y - 1] != true) {
			currentLocation.y = currentLocation.y - 1;
		}
	}

	//checks whether this would move it off the grid south or if there is an island in the way
	public void goSouth(boolean[][] oceanGrid) {
		// TODO Auto-generated method stub
		if (currentLocation.y < 24 && oceanGrid[currentLocation.x][currentLocation.y + 1] != true) {
			currentLocation.y = currentLocation.y + 1;
		}
	}
}
