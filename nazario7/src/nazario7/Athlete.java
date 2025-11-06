// Xavier Nazario
// Student ID# 2512208

// Program that displays a list of athlete names

package nazario7;

// Import ArrayList and Iterator utility
import java.util.ArrayList;
import java.util.Iterator;

public class Athlete {

	// Method for Athlete List
	public static void main(String[] args) {

		// Create ArrayList for names
		// Make String
		ArrayList<String> athlete = new ArrayList<>();

		// Add names
		athlete.add("Tom Brady");
		athlete.add("Rhonde Barber");
		athlete.add("Lionel Messi");
		athlete.add("Cristiano Ronaldo");
		athlete.add("Matt Kemp");

		// Process list with for loop
		// Display names with get() method
		System.out.println("Here is the list");
		for (int i = 0; i < athlete.size(); i++) {
			System.out.println(athlete.get(i));
		}

		// Pass list to method
		modifyAthleteList(athlete);

		// Create an iterator ArrayList
		// Display list again
		System.out.println("\nUsing an iterator, here is the list");
		Iterator<String> iterator = athlete.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// Method to swap indexes
	public static void modifyAthleteList(ArrayList<String> list) {

		// Insert name at index 2
		list.add(2, "Shohei Ohtani");

		// Remove name at index 4
		list.remove(4);

		// Use foreach loop to display ArrayList
		// All names on one line separated by asterisks
		System.out.print("\nHere is the new list");
		for (String name : list) {
			System.out.print(name + " * ");
		}
		// Remove the last asterisk
		System.out.println();

	}

}
