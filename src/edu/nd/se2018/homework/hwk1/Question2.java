package edu.nd.se2018.homework.hwk1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question2 {

	public Question2(){}
	
	public String getMostFrequentWord(String input, String stopwords){
		
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		/* Splits the main input into a String array */
		String[] in = input.split(" ");
		
		/* Splits the stopwords into a String array */
		String[] stops = stopwords.split(" ");
		
		/* Loops through every word in the input and, if it's not a stopword,
		 * either adds the word to the hash map if it doesn't already exist or
		 * updates the entry for the one that does exist */
		for (int i = 0; i < in.length; i++) {
			String word = in[i];
			if (Arrays.asList(stops).contains(word) == false) {
				if (h.containsKey(word)) {
					int occurrences = h.get(word);
					occurrences += 1;
					h.put(word,  occurrences);
				}
				else {
					h.put(word, 1);
				}
			}
		}
		
		/* Sets variables for the max occurrence and word that goes with that value.
		 * In the loop, every entry in the HashMap is checked. If the occurrence is
		 * more than the current max, its value is recorded. If it's equal, that means
		 * there's more than one word with that occurrence, and the value is reset.
		 * Lastly, if it's less than the current max, then it is ignored. */
		int maxOcc = 0;
		String maxWord = null;
		
		for (Map.Entry<String, Integer> entry : h.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			if (value > maxOcc) {
				maxOcc = value;
				maxWord = key;
			}
			else if (value == maxOcc) {
				maxWord = null;
			}
		}
		
		return maxWord;
	}
}
