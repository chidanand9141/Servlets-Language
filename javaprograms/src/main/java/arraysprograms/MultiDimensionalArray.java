package arraysprograms;


//TwoDarray
public class MultiDimensionalArray {
public static void main(String[] args) {
	int rows=4;
	int coloumns=4;
	 int[][] array =new int[rows][coloumns];
	 int value=1;
	 for (int i = 0; i < rows; i++) {
for (int j = 0; j < coloumns; j++) {
	array[i][j]=value;
	value++;
}		
	}
	 System.out.println("The 2D array is: ");
	 for (int i = 0; i < rows; i++) {
		for (int j = 0; j < coloumns; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
}
}
