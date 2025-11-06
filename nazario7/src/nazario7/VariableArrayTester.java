package nazario7;

public class VariableArrayTester {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int[] int05 = { 5, 10, 0, 2, 3 };
		int[] int10 = { 15, 20, 0, 23, 33, 77, 88, 22, 98, -3 };
		int[] int12 = { 16, 21, 1, 22, 44, 78, 67, 38, -5, 78, 44, 85 };

		max = VariableArray.maxInArray(int05);
		System.out.println("Max in array 05 : " + max);
		max = VariableArray.maxInArray(int10);
		System.out.println("Max in array 10 : " + max);
		max = VariableArray.maxInArray(int12);
		System.out.println("Max in array 12 : " + max);

		min = VariableArray.minInArray(int05);
		System.out.println("Min in array  5 : " + min);
		min = VariableArray.minInArray(int10);
		System.out.println("Min in array 10 : " + min);
		min = VariableArray.minInArray(int12);
		System.out.println("Min in array 12 : " + min);
	}
}
