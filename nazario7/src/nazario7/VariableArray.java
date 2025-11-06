// Xavier Nazario
// Student ID# 2512208

// Program that tests for array length
package nazario7;

public class VariableArray {

	// Method for the max element in an array

	public static int maxInArray(int[] array) {

		// Check array length or empty
		// Use if state
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}

		int max = array[0];
		// Use for if loop
		// Declare max element
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// Method for the min element in an array

	public static int minInArray(int[] array) {

		// Check array length or empty
		// Use if state
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}

		int min = array[0];
		// Use for if loop
		// Declare min element
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
