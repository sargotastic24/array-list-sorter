import java.util.ArrayList;
import java.util.Random;
import assign05.ArrayListSorter;

/*
 * @author Sarthak Goyal
 */

public class ArrayListSorterTiming {
	public static void main(String[] args) {
		int[] arr1 = new int[10000];
		  // Do 10000 lookups and use the average running time.
	    int timesToLoop = 50;
	    
	    // For each problem size n . . .
	    for (int n = 1000; n <= 10000; n += 1000) {
	      long startTime, midpointTime, stopTime;
	      startTime = System.nanoTime();
	      while (System.nanoTime() - startTime < 1000000000) { // empty block 
	      }

	      // Now, run the test.  
	      startTime = System.nanoTime();

	      for (int i = 0; i < timesToLoop; i++) {        //Note: Code for pivot strategies.
	    	  ArrayList<Integer> a = ArrayListSorter.generateDescending(40);
	    	  ArrayListSorter.quicksort(a);
	    	  //ArrayListSorter.mergesort(a);
	      }

	      midpointTime = System.nanoTime();

	      for (int i = 0; i < timesToLoop; i++) { 	 //code for subtracting areAnagram additional time.
	    	  ArrayList<Integer> a = ArrayListSorter.generatePermuted(40);
	      }
	      
	      /*for (int i = 0; i < timesToLoop; i++) {        //code for subtracting generateRandomStringArray additional time
	    	  String[] a = generateRandomStringArray(n);
	      }*/

	      stopTime = System.nanoTime();

	      // Compute the time, subtract the cost of running the loop
	      // from the cost of running the loop and doing the lookups.
	      // Average it over the number of runs.
	      double averageTime = ((midpointTime - startTime) - (stopTime - midpointTime))
	          / timesToLoop;

	      System.out.println(n + "\t" + averageTime);
	  }

	}
		
}
