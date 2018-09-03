package edu.nd.se2018.homework.hwk1;
public class Question3 {
	
	public Question3(){}	
	
    public int getMirrorCount(int[] numbers){
    	
    	int len = numbers.length;
        int max = 0;
        
        /* Returns 0 if numbers is an empty set */
        if (len == 0)
            return max;
        
        /* Loops through every value in the set, using each as the "starting point"
         * of the mirror check */
        for (int i = 0; i < len; i++)
        { 
        	/* Loops through every remaining value starting from the end of the set,
        	 * using each of these as the "ending point" */
            int count=0;
            for (int j = len - 1; j >= i; j--)
            {
            	/* Checks whether or not the values in the set on opposite ends are
            	 * the same. If they are, the count is increased, which effectively
            	 * moves the start point forwards by 1 and the end point back by 1.
            	 * If they aren't the same, it breaks out of the loop */
                if (numbers[i + count] != numbers[j])
                {
                    break;
                }
                count++;
            }

            /* Updates the max mirror size */
            if (count > max) {
            	max = count;
            }
        }

        return max;
        
	}
}
