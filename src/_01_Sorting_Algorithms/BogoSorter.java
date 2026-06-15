package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] arr, SortingVisualizer display) {

		boolean b = false;
		Random rand = new Random();
		while (!b) {
			
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] <= arr[i + 1]) {
					if(i == arr.length-1) {
						b = true; 
					}
				} else {
					//System.out.println("break"); 
					break;
				}
			}

			
			int x = rand.nextInt(arr.length);
			int y = rand.nextInt(arr.length);
			//System.out.println(x + " " + y); 
			int w = arr[x];
			arr[x] = arr[y];
			arr[y] = w;
			//System.out.println(arr[x]); 
			display.updateDisplay();
		

		}
	}

}
