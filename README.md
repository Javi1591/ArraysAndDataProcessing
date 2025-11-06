# COP2251 – Java Assignment 7

## Summary
This assignment contains three small Java programs that practice array processing, random simulation and tallying, and collection handling. The work emphasizes indexed iteration, aggregation (min/max and differences), and formatted console output across arrays and `ArrayList`.

## Program Behavior
- VariableArray / VariableArrayTester  
  - Provides utility methods that operate on integer arrays (for example, computing the maximum and minimum values).  
  - The tester constructs several sample integer arrays, calls the array-utility methods (e.g., maximum element), and prints results to the console.  
  - Demonstrates defensive checks for null/empty arrays and iterates with simple `for` loops to compute results.

- Dice  
  - Simulates a large number of six-sided die rolls using `java.util.Random`.  
  - Stores individual outcomes, tallies frequencies for faces 1–6, and prints per-face counts.  
  - Calculates and displays the difference between the largest and smallest face counts as a simple measure of distribution spread.

- Athlete  
  - Builds an `ArrayList<String>` of athlete names and prints the list in multiple formats.  
  - Demonstrates `ArrayList` operations such as indexed removal.  
  - Prints the updated list with asterisks between names on a single line.

## Key Concepts Demonstrated
- Arrays: Allocation, traversal, and aggregation (min/max).  
- Random Simulation: Generating pseudorandom integers and tallying frequencies.  
- Collections: Using `ArrayList`, indexed access, removal, and iteration (enhanced for-loop).  
- Defensive Programming: Null/empty checks for arrays.  
- Console Output: Clear, labeled printing of intermediate and final results.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands (from the `nazario7/src` directory):
javac -d ../out module-info.java nazario7/VariableArray.java nazario7/VariableArrayTester.java nazario7/Dice.java nazario7/Athlete.java  
java -cp ../out nazario7.VariableArrayTester  
java -cp ../out nazario7.Dice  
java -cp ../out nazario7.Athlete
