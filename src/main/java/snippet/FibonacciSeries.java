package snippet;

public class FibonacciSeries {
	public static void main(String[] args) {
	       // Declare two separate arrays to store integer values
	       int[] array1 = {3, 2, 11, 4, 6, 7};
	       int[] array2 = {1, 2, 8, 4, 9, 7};
	       // Print a message to indicate that we are finding the intersection
	       System.out.print("Intersection numbers are: ");

	       // Iterate over each element in array1
	       for (int i = 0; i < array1.length; i++) {
	           // Iterate over each element in array2
	           for (int j = 0; j < array2.length; j++) {
	               // Compare the elements of array1 with elements of array2
	               if (array1[i] == array2[j]) {
	                   // If a match is found, print the matching element
	                   System.out.print(array1[i] + ", ");
	               }
	           }
	       }
	   }
}
