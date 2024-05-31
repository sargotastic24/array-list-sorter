/*
 * @author Sarthak Goyal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListSorter { 
	//private static int threshold = 70;
	//private static int threshold = 40;
	//private static int threshold = 25;
	private static int threshold = 13;
	//private static int threshold = 3;
	
	//Driver Methods
	//Make sure not to get quadratic time.
	public static <T extends Comparable<? super T>> void mergesort(ArrayList<T> arrList) {  //performs a merge sort on the generic ArrayList as given input
		if(arrList.size() <= threshold) {
			
		}
		
		ArrayList<T> tempArrList = new ArrayList<T>(arrList.size());
		
		for (int i = 0; i < arrList.size(); i++) {
			tempArrList.add(null);
		}
		mergeSortRecursive(arrList, tempArrList, 0, arrList.size()-1);

	}
	
	public static <T extends Comparable<? super T>> void quicksort(ArrayList<T> list) {  //performs a quicksort on the generic ArrayList given as input
		//int pivot = WorstPivot(list);
		//int pivot = BestPivot(list);
		//int pivot = AveragePivot(list, 0, list.size()-1);
		quickSortRecursive(list, 0, list.size()-1);
	}
	
	public static ArrayList<Integer> generateAscending(int size){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int j = 1;
		for(int i = 0; i <= size - 1; i++) {
			list.add(j);
			j++;
		}
		return list;
	}

	public static ArrayList<Integer> generatePermuted(int size){ //
		ArrayList<Integer> list = generateAscending(size);
		Collections.shuffle(list);
		return list; 
	}
	
	public static ArrayList<Integer> generateDescending(int size){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = size; i >= 1; i--) {
			list.add(i);
		}
		return list;
	}
	
	// shuffles the elements of the array for generatePermuted().
	public final static <T> void swap(ArrayList<T> arr, int i, int j) {
		T temp = arr.get(i);
		T temp02 = arr.get(j);
		arr.set(i, temp02);
		arr.set(j, temp);		
	}
	
	//insertionSort helper method, pertains to threshold
	public static <T extends Comparable<? super T>> void insertionSort(ArrayList<T> arr, int first, int last) {
		for(int i = first; i <= last; i++) {
			 T val = arr.get(i);
			 int j;
			 for(j = i-1; j >= first && arr.get(j).compareTo(val) > 0; j--) {
			 arr.set(j+1, arr.get(j));
			 }
			 arr.set(j+1, val);
		}
	}
	
	//Merges both ArrayLists, call in mergeSort() method.
	//Reference: https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
	public static <T extends Comparable<? super T>> void mergeSortRecursive(ArrayList<T> list, ArrayList<T> tempArr, int left, int right) {
		if (right-left <= threshold) {
			insertionSort(list, left, right);
		}
		else {
			int middle = (left + right)/2;
			mergeSortRecursive(list, tempArr, left, middle);
			mergeSortRecursive(list, tempArr, middle + 1, right);
			merge(list, tempArr, left, middle+1, right);
		}
	}
	
	public static <T extends Comparable<? super T>> void merge(ArrayList<T> arrList, ArrayList<T> tempArrList, int left, int mid, int right) {
		int end = mid-1;
		int curr = left;
		int start = left;
		
		while(left <= end && mid <= right) {
			
			if(arrList.get(left).compareTo(arrList.get(mid)) <= 0) {
				tempArrList.set(curr++, arrList.get(left++));
			}
			
			else { 
				tempArrList.set(curr++, arrList.get(mid++));
			}
		}
		
		while(left <= end) {
			tempArrList.set(curr++, arrList.get(left));
			left++;
		}
		
		while(mid <= right) {
			tempArrList.set(curr++, arrList.get(mid++));
		}
		
		for (int i = start; i <= right; i++) {
			//right--;
			arrList.set(i, tempArrList.get(i));
			//right--;
		}
	}

	public static <T extends Comparable<? super T>> void quickSortRecursive(ArrayList<T> list, int left, int right) {
		while(left < right) {
			int mid = partitionList(list, left, right);
			quickSortRecursive(list, left, mid - 1);
			quickSortRecursive(list, mid + 1, right);
			left++;
		}
		
	}
	
	public static <T extends Comparable<? super T>> int partitionList(ArrayList<T> list, int left, int right) {
		int piv = AveragePivot(list, left, right);
		//int piv = WorstPivot(list);
		//int piv = BestPivot(list);
		T pivot = list.get(piv);
		
		swap(list, left, piv);
		int i = left;
		int j = right;
		while(true) {
			while(i <= j) {
				if (list.get(i).compareTo(pivot) <= 0) {
					i++;
				}
				else {
					break;
				}
			}
			while(j > i) {
				if(list.get(j).compareTo(pivot) > 0) {
					j--;
				}
				else {
					break;
				}
			}
		
		if (i >= j) {
			break;
		}
		
		swap(list, i, j);
		}
		
		list.set(left, list.get(i - 1));
		list.set(i-1, pivot);
		return i - 1;
	
		
	}
	
	private static int WorstPivot(ArrayList list) {
		int n = list.size() - 1;
		return n;
	}

	private static <T extends Comparable<? super T>> int AveragePivot(ArrayList<T> list, int left, int right) {
		int mid = (left + right)/2;
		return mid;
	}
	
	//Takes the Median of 5 elements of the Array list.
	private static<T extends Comparable<? super T>> int BestPivot(ArrayList<T> list) {
		return list.size()/2;
	}
	
}
