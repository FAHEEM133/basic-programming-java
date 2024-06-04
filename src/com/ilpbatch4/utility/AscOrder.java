package com.ilpbatch4.utility;

public class AscOrder {
	    public static void main(String[] args) {
	        int[] numbers = {4, 2, 1, 3};
	        selectionSort(numbers);
	        System.out.print("Sorted Numbers: ");
	        
	        for (int i=0;i<numbers.length;i++) {
	        	System.out.print(numbers[i]+" ");
	        }
	    }

	    private static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            if (minIndex != i) {
	                // Swap arr[i] and arr[minIndex] without using temp variable
	                arr[i] = arr[i] + arr[minIndex];
	                arr[minIndex] = arr[i] - arr[minIndex];
	                arr[i] = arr[i] - arr[minIndex];
	            }
	        }
	    }

}
