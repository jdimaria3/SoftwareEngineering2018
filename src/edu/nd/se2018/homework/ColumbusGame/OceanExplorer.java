package edu.nd.se2018.homework.ColumbusGame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OceanExplorer extends Application {
	
	//class level instantiations
	AnchorPane myPane = new AnchorPane();
	Scene scene = new Scene(myPane,625,625);
	OceanMap oceanMap = new OceanMap();
	Ship ship = new Ship();
	PirateShip ps1 = new PirateShip();
	ImageView shipImageView;
	ImageView pshipImageView;
	
	@Override
	public void start(Stage oceanStage) throws Exception {
		// TODO Auto-generated method stub
		
		//Creates the pmap for the game
		oceanMap.drawMap(myPane.getChildren(), 25);
		oceanStage.setScene(scene);
		oceanStage.setTitle("ColumbusGame");
	
		
		//Creates the image for Columbus' ship and places it on the pane/stage
		Image shipImage = new Image("images//ColumbusShip.png",25,25,true,true);
		shipImageView = new ImageView(shipImage);
		shipImageView.setX(ship.getShipLocation().x * 25);
		shipImageView.setY(ship.getShipLocation().y * 25);
		myPane.getChildren().add(shipImageView);
		
		
		//Creates the image for a pirate ship and places it on the pane/stage, without implementation
		//for the pirate ship functions and observer status
		Image pshipImage = new Image("images//pirateship.gif",25,25,true,true);
		pshipImageView = new ImageView(pshipImage);
		pshipImageView.setX(ps1.getShipLocation().x * 25);
		pshipImageView.setY(ps1.getShipLocation().y * 25);
		myPane.getChildren().add(pshipImageView);
		
		oceanStage.show();
		
		startSailing(oceanMap);
		
	}
	
	//copied from guided part of document
	private void startSailing(OceanMap oceanMap) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
		@Override
		public void handle(KeyEvent ke) {
			switch(ke.getCode()) {
				case RIGHT:
					ship.goEast(oceanMap.oceanGrid);
					break;
				case LEFT:
					ship.goWest(oceanMap.oceanGrid);
					break;
				case UP:
					ship.goNorth(oceanMap.oceanGrid);
					break;
				case DOWN:
					ship.goSouth(oceanMap.oceanGrid);
					break;
				default:
					break;
			}
			shipImageView.setX(ship.getShipLocation().x * 25);
			shipImageView.setY(ship.getShipLocation().y * 25);
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}