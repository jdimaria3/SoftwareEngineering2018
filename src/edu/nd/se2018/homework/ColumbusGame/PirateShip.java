package edu.nd.se2018.homework.ColumbusGame;

import java.awt.Point;
import java.util.Observable;

public class PirateShip extends Observable {

	Point currentLocation = new Point();
	
	public PirateShip() {
		currentLocation.x = 20;
		currentLocation.y = 20;
	}
	
	public Point getShipLocation() {
		return currentLocation;
	}
}
