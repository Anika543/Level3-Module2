package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {

		int y = num1 * num2;
		String x = num1 + " x " + num2 + " = " + y;

		return x;
	}

	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}

		return prime;
	}

	public static boolean isSquare(int num) {
		boolean square = false;

		for (int i = 0; i < num+1; i++) {
			if (i * i == num) {
				square = true;
			}
		}

		return square;
	}
	
	public static boolean isCube(int num) {
		boolean cube = false; 
		
		for (int i = 0; i < num+1; i++) {
			if (i * i * i == num) {
				cube = true;
			}
		}
		
		return cube; 
	}

	public static int findBrokenEgg(List<String> eggs) {
		int index = -1; 
		for(int i = 0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				index = i; 
				break; 
			}
		}
		return index; 
	}
	
	public static int countPearls(List<Boolean> pearls) {
		int count = 0; 
		for(int i = 0; i<pearls.size(); i++) {
			if(pearls.get(i) == true) {
				count++; 
			}
		}
		
		return count; 
	}
	
	public static double findTallest(List<Double> peeps) {
		Double x = 0.0; 
		
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > x) {
				x = peeps.get(i); 
			}
		}
		
		return x; 
	}
	
}






































