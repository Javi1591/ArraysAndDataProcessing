// Xavier Nazario
// Student ID# 2512208

// Program that simulates 6 million dice rolls
// and records the data
package nazario7;

// Import Random utility
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// Declare array rolls to hold 6million
		// Use integer
		int[] rolls = new int[6000000];

		// Declare smaller array count to hold 1 to 6
		// Use integer
		int[] count = new int[6];

		// Create Random instance for dice rolls
		Random random = new Random();

		// Roll the dice simulation
		// Use for loop
		// Use integer
		for (int i = 0; i < rolls.length; i++) {
			// Initiate dice roll using Random
			// Use roll name
			// Increase count for rolled number by 1
			int roll = random.nextInt(6) + 1;
			rolls[i] = roll;
			count[roll - 1]++;
		}

		// Display Results
		System.out.println("Results of 6 million dice rolls:");
		for (int i = 0; i < count.length; i++) {
			System.out.println("Number of " + (i + 1) + "s: " + count[i]);
		}

		// Get the smallest/largest count
		// Get difference between largest/smallest count
		// Declare max and min array
		// Use integer
		int max = count[0];
		int min = count[0];

		// Use for loop to find small/large
		// Use for if if
		for (int i = 1; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
			if (count[i] < min) {
				min = count[i];
			}
		}

		// Declare and get difference
		int difference = max - min;
		// Display
		System.out.println("Difference between Largest and Smallest " + "is: " + difference);

	}

}
