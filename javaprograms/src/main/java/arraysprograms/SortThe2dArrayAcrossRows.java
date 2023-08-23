package arraysprograms;
import java.io.*;
import java.lang.*;
import java.util.*;
public class SortThe2dArrayAcrossRows {
public static void main(String[] args)throws java.lang.Exception{
     int[][] arr= { {1, 8, 4, 7, 3 },
    		 { 8, 3, 1, 7, 5 },
     { 6, 2, 0, 7, 1 },
     { 2, 6, 4, 1, 9 } };
     
     System.out.println("matrix without sorting \n");
     for (int i = 0; i < 4;i++) {
         for (int j = 0; j < 5; j++){
			System.out.print(arr[i][j] + " " );
		}
         System.out.println();
	}
     System.out.println();
     Vector<Integer> v= new Vector<Integer>();
      for(int i=0; i<4; i++) {
    	  for (int j = 0; j < 5;j++) {
    		  v.add(arr[i][j]);
    	  }
    	 Collections.sort(v);
    	 for (int j = 0; j <5; j++) {
    		 arr[i][j] =v.get(j);
    	 }
    	 v.removeAll(v);
      }
      System.out.println("Matrix after sorting \n");
      for (int i = 0; i < 4;i++) {
    	  for (int j = 0; j <5;j++) {
			System.out.print(arr[i][j] + " " );
		}
    	  System.out.println();
		
	}
}
}