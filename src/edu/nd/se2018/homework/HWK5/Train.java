package edu.nd.se2018.homework.HWK5;

import java.util.Observable;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Represents the train entity object
 * @author jane
 *
 */
public class Train extends Observable implements IVehicle{
	private double currentX = 0;
	private double currentY = 0;
	private double originalX = 0;
	private Image img;
	private ImageView imgView;
	private int trainLength = 35;
	private String direction;
	
	//Added a direction variable, works properly for both "east" and "west"
	public Train(int x, int y, String dir){
		this.currentX = x;
		this.currentY = y;
		originalX = x;
		direction = dir;
		img = new Image("images//Train.PNG",120,trainLength,false,false);
		imgView = new ImageView(img);
		imgView.setX(currentX);
		imgView.setY(currentY);
	}
	
	public double getVehicleX(){
		return currentX;
	}
	
	public double getVehicleY(){
		return currentY;
	}
	
	//If statement checks on the direction of the train and updates the 
	//x coordinate appropriately
	public void move(){
		if (direction == "west") {
			currentX-=2;
		}
		else if (direction == "east") {
			currentX+=2;
		}
		imgView.setX(currentX);
		setChanged();
		notifyObservers();
	}
	
	//If statement checks on the direction of the train and determines
	//whether the train is off screen appropriately
	public boolean offScreen(){
		if (currentX < -200 && direction == "west")
			return true;
		else if (currentX > 1400 && direction == "east") {
			return true;
		}
		else
			return false;				
	}
	
	public void reset(){
		currentX = originalX;
	}

	//@Override
	public Node getImageView() {
		return imgView;
	}
}