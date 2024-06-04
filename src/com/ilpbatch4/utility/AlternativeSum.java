package com.ilpbatch4.utility;

public class AlternativeSum {

	public static void main(String[] args) {
		int n = 7;
		altSum(n);

	}

	private static void altSum(int n) {
		int j = 1, sum = 0;

		for (int i = 0; i < n; i++) {
			if (j <= n) {

				if ((i % 2) == 0) {
					sum = sum + j;
				} else {
					sum = sum - j;
				}
				j = j + 2;
			}
		}
		System.out.print("Sum of series : " + sum);

	}

}