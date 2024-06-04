package com.ilpbatch4.utility;
import java.util.Random;	
public class CheckWithK {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for(int i =0;i<arr.length;i++)
		{
		int randomNo = random.nextInt(10);
		arr[i] = randomNo;			
		}
		//to store array without duplicate values
		int uniqueArray[] = removeDuplicates(arr);
		
		System.out.println("Original array: ");	
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");		
		}
		System.out.println("Unique array: ");	
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(uniqueArray[i]+" ");		
		}
		
		int check = 16;
//		System.out.println("");
		System.out.println("The value to be checked with: " + check);
		checkSum(uniqueArray, check);
	}

	private static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] tempArray = new int[n];
//        int[] tempArrayNew = new int[n];
        int j = 0;
        int count=0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if the current element already exists in the new array
            for (int k = 0; k < j; k++) {
                if (arr[i] == tempArray[k]) {
                    isDuplicate = true;
                    count++;
                    break;
                }
            }
            
            // If not a duplicate, add it to the new array
            if (!isDuplicate) {
                tempArray[j] = arr[i];
                j++;
            }
        }
        int[] tempArrayNew = new int[n-count];
        
        //to get rid of the excess zeros
        for(int k=0;k<n-count;k++) {
        	tempArrayNew[k] += tempArray[k];
        }
        return tempArrayNew;
        // Create a new array with size equal to the number of unique elements

        //        int[] uniqueArray = new int[j];
//        System.arraycopy(tempArray, 0, uniqueArray, 0, j);
        
//        return uniqueArray;
    }
	
	private static void checkSum(int[] arr, int check)
	{
		int count = 0;
		System.out.println("The possible pairs are: ");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i] + arr[j] == check) {
					System.out.print(arr[i] + " and "+ arr[j] + ", ");
					count ++;
				}
			}
		}
		if(count == 0)
		{
			System.out.print("None");
		}
		
	}
	
//	private static void randomFunc(int[] arr, int i, int randomNo) {
//
//	}
	


}
