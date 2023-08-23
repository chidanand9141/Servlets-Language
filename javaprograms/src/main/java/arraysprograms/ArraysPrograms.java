package arraysprograms;
//Java program to Demonstrate arrays class
//Via binary search() method

import java.util.Arrays;
public class ArraysPrograms {
public static void main(String[] args) {
	int intArr[] = {10, 20, 15, 22, 35};
	int intKey = 22;
	System.out.println(intKey + " found at index " + Arrays.binarySearch(intArr, intKey));
	
}
}
