package com.ilpbatch4.utility;
public class SortZeroAndOne {

	public static void main(String[] args) {
		int[] arr = { 1,0,1,1,1,2,2,2,0,0,0};
		System.out.print("Sorted array : ");
		sortArray(arr);

	}

	private static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];	
				}
				
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");	
			}
		
	}

}
