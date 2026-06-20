package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	String[] x = {"sdf", "hello", "abc", "dksdfsd"};
	String value = "abc"; 

	int[] arr1 = {1, 3, 4, 8, 15, 24, 233}; 
	int value2 = 24; 
	
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(2, _01_LinearSearch.linearSearch(x, value));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(5, _02_BinarySearch.binarySearch(arr1, 0, arr1.length-1, value2));
    }
}
