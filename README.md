# array-list-sorter

ArrayListSorter
Overview
This project involves creating a robust and efficient routine for sorting Java ArrayLists using generic methods. We will implement two sorting algorithms: merge sort and quicksort. Additionally, we will generate and test ArrayLists in three different orderings: ascending, permuted, and descending.

Implementation Details

1) mergesort(ArrayList<T> list):

Implements the merge sort algorithm.
Switches to insertion sort when the sublist size is below a specified threshold.
Uses private helper methods for merge operations and insertion sort.

2) Private Helper Methods:

- mergeSortRecursive(ArrayList<T> list, int left, int right)
- merge(ArrayList<T> list, int left, int middle, int right)
- insertionSort(ArrayList<T> list, int left, int right)

3) quicksort(ArrayList<T> list):

- Implements the quicksort algorithm.
- Supports three pivot selection strategies.
- Uses private helper methods for partitioning and pivot selection.

4) Private Helper Methods:

- quickSortRecursive(ArrayList<T> list, int left, int right)
- partition(ArrayList<T> list, int left, int right, T pivot)
- selectPivotFirst(ArrayList<T> list, int left, int right)
- selectPivotRandom(ArrayList<T> list, int left, int right)
- selectPivotMedian(ArrayList<T> list, int left, int right)
- insertionSort(ArrayList<T> list, int left, int right)


Generating Test Data

5) generateAscending(int size):

Creates an ArrayList with integers in ascending order from 1 to size.

6) generatePermuted(int size):

Creates an ArrayList with integers from 1 to size in random order using Collections.shuffle.

7) generateDescending(int size):

Creates an ArrayList with integers in descending order from size to 1.


Testing

Created JUnit 5 test classes to ensure the functionality of each method.
