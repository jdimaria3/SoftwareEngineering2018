package edu.nd.se2018.homework.hw3;

public class Horse extends Race {

	String name;
	int number;
	int speed;
	String strat;
	
	public Horse(String na, int nu, int sp, String st) {
		name = na;
		number = nu;
		speed = sp;
		strat = st;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getStrategy() {
		return strat;
	}
}
