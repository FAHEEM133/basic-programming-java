package com.ilpbatch4.utility;

public class AlternateSumPow {

	public static void main(String[] args) {
		int input = 5;
		sumOfSeries(input);
	}
	private static void sumOfSeries(int input) {
		int sum = 0;
		int operation_count = 0;
		int power_val;
		for (int i = 1; i <= input; i += 2) {
			if (operation_count % 2 == 0) {
				power_val=(int) Math.pow(i, (operation_count+1));
				sum += power_val;
			} else {
				power_val=(int) Math.pow(i, (operation_count+1));
				sum -= power_val;
			}
			operation_count++;
		}
		System.out.println("sum = " + sum);
	}
}

