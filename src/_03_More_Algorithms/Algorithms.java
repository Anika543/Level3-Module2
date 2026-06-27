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

		for (int i = 0; i < num + 1; i++) {
			if (i * i == num) {
				square = true;
			}
		}

		return square;
	}

	public static boolean isCube(int num) {
		boolean cube = false;

		for (int i = 0; i < num + 1; i++) {
			if (i * i * i == num) {
				cube = true;
			}
		}

		return cube;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int index = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int countPearls(List<Boolean> pearls) {
		int count = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				count++;
			}
		}

		return count;
	}

	public static double findTallest(List<Double> peeps) {
		Double x = 0.0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > x) {
				x = peeps.get(i);
			}
		}

		return x;
	}

	public static String findLongestWord(List<String> words) {
		String s = "";

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > s.length()) {
				s = words.get(i);
			}
		}

		return s;

	}

	public static boolean containsSOS(List<String> Message) {
		boolean b = false;

		for (int i = 0; i < Message.size(); i++) {
			if (Message.get(i).contains("... --- ...")) {
				b = true;
				break;
			}
		}

		return b;
	}

	public static List<Double> sortScores(List<Double> results) {

		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) >= results.get(j + 1)) {
					Double x = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j + 1, x);

				}

			}

		}

		return results;

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {

		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				if (unsortedSequences.get(j).length() >= unsortedSequences.get(j + 1).length()) {
					String x = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j + 1));
					unsortedSequences.set(j + 1, x);
				}
			}
		}

		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {

		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size() - 1; j++) {
				if((words.get(j)).compareTo(words.get(j+1)) >= 0){
					String x = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, x);
				}
			}
		}

		return words;

	}

}















