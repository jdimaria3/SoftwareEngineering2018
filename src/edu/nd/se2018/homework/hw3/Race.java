package edu.nd.se2018.homework.hw3;

import java.util.ArrayList;
import java.util.List;

public class Race {

	public Race(){}
	
	List<Horse> horses = new ArrayList<Horse>();
	
	public void enrollHorse(String name, int number, int speed, String strategy) {

		Horse h = new Horse(name, number, speed, strategy);
		horses.add(h);
		
	}
	
	public void doRace() {
		
		
	}
	
	public List<Horse> getArray() {
		return horses;
	}
}
