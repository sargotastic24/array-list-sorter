/*
 * @author Sarthak Goyal
 */

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ArrayListSorterTesting {
	
	@Test
	public void mergeSortSimple() {
		
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(2);
		arrInt.add(4);
		arrInt.add(1);
		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(4);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void mergeSortSomeDuplicates() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(2);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(7);
		arrInt.add(8);
		arrInt.add(22);
		arrInt.add(108);
		arrInt.add(9);
		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(2);
		sol.add(7);
		sol.add(8);
		sol.add(9);
		sol.add(22);
		sol.add(108);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(sol, arrInt);
	}
	
	@Test
	public void mergeSortAllDuplicates() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		arrInt.add(1);
		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		sol.add(1);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void mergeSortAscending() {	
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(3);
		arrInt.add(4);
		arrInt.add(5);
		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void mergeSortDescending() {
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayList<Integer> sol2 = ArrayListSorter.generateDescending(5);
		ArrayListSorter.mergesort(sol2);
		assertEquals(sol2, sol);
	}
	
	@Test
	public void mergeSortNegativeNumbers() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(-5);
		arrInt.add(-2);
		arrInt.add(-8);
		arrInt.add(-3);
		arrInt.add(-9);
		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(-9);
		sol.add(-8);
		sol.add(-5);
		sol.add(-3);
		sol.add(-2);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void mergeSortAllNumbers() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(-3);
		arrInt.add(-5);
		arrInt.add(-1);
		arrInt.add(-2);
		arrInt.add(-4);
		arrInt.add(3);
		arrInt.add(5);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(4);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(-5);
		sol.add(-4);
		sol.add(-3);
		sol.add(-2);
		sol.add(-1);
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayListSorter.mergesort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortSomeDuplicates() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(2);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(7);
		arrInt.add(8);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(2);
		sol.add(7);
		sol.add(8);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);

	}
	
	@Test
	public void quickSortAllDuplicates() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(2);
		arrInt.add(2);
		arrInt.add(2);
		arrInt.add(2);
		arrInt.add(2);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(2);
		sol.add(2);
		sol.add(2);
		sol.add(2);
		sol.add(2);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortAscending() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(3);
		arrInt.add(4);
		arrInt.add(5);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortPermuting() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(3);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(8);
		arrInt.add(7);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(7);
		sol.add(8);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortDescending() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(5);
		arrInt.add(4);
		arrInt.add(3);
		arrInt.add(2);
		arrInt.add(1);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortLong() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(3);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(8);
		arrInt.add(7);
		arrInt.add(15);
		arrInt.add(5);
		arrInt.add(6);
		arrInt.add(18);
		arrInt.add(40);
		arrInt.add(82);
		arrInt.add(74);
		arrInt.add(89);
		arrInt.add(11);
		arrInt.add(46);
		

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(5);
		sol.add(6);
		sol.add(7);
		sol.add(8);
		sol.add(11);
		sol.add(15);
		sol.add(18);
		sol.add(40);
		sol.add(46);
		sol.add(74);
		sol.add(82);
		sol.add(89);

		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortNegativeNumbers() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(-3);
		arrInt.add(-5);
		arrInt.add(-1);
		arrInt.add(-2);
		arrInt.add(-4);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(-5);
		sol.add(-4);
		sol.add(-3);
		sol.add(-2);
		sol.add(-1);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	
	@Test
	public void quickSortAllNumbers() {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(-3);
		arrInt.add(-5);
		arrInt.add(-1);
		arrInt.add(-2);
		arrInt.add(-4);
		arrInt.add(3);
		arrInt.add(5);
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(4);

		
		ArrayList<Integer> sol = new ArrayList<>();
		sol.add(-5);
		sol.add(-4);
		sol.add(-3);
		sol.add(-2);
		sol.add(-1);
		sol.add(1);
		sol.add(2);
		sol.add(3);
		sol.add(4);
		sol.add(5);
		
		ArrayListSorter.quicksort(arrInt);
		assertEquals(arrInt, sol);
	}
	


}
