package com.ilpbatch4.utility;
 
public class DescendingOrder {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 55;
		int num2 = 2;
		int num3 = 39;
		arrangeDescending(num1, num2, num3);
	}
 
	private static void arrangeDescending(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if (num1 >= num2 && num1 >= num3) {
			System.out.print(num1 + " ");
			if (num2 >= num3) {
				System.out.print(num2 + " ");
				System.out.print(num3 + " ");
			} else {
				System.out.print(num3 + " ");
				System.out.print(num2 + " ");
			}
		} else if (num2 >= num3 && num2 >= num1) {
			System.out.print(num2 + " ");
			if (num1 >= num3) {
				System.out.print(num1 + " ");
				System.out.print(num3 + " ");
			} else {
				System.out.print(num3 + " ");
				System.out.print(num1 + " ");
			}
		} else {
			System.out.print(num3 + " ");
			if (num1 >= num2) {
				System.out.print(num1 + " ");
				System.out.print(num2 + " ");
			} else {
				System.out.print(num2 + " ");
				System.out.print(num1 + " ");
			}
		}
	}
 
}