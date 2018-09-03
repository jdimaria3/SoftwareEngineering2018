package edu.nd.se2018.homework.hwk1;

import java.util.HashSet;

public class Question1 {
		
	public Question1(){}
	
	public int getSumWithoutDuplicates(int[] numbers){
		
		int total = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		
		/* Loops through vector, checks if the number has been seen before
		 * if it hasn't, then it's added to the total and HashSet. If it has,
		 * then nothing happens
		 */
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if (h.contains(num) == false) {
				total += num;
				h.add(num);
			}
			
		}
		
		return total;
	}
}
