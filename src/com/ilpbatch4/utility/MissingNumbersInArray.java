package com.ilpbatch4.utility;

public class MissingNumbersInArray {

    public static void main(String[] args) {
        int[] arr = {1,4,7,8,10};
        int input = 10;
        findMissingNumber(arr, input);
    }
    private static void findMissingNumber(int[] arr, int input) {

        int[] ar = new int[input - arr.length];
        int index = 0;
        for (int i = 1; i <= input; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ar[index] = i;
                index++;
            }
        }
        for (int j = 0; j < ar.length; j++) {
            System.out.print(" " + ar[j]);
        }
    }
}



