package com.ilpbatch4.utility;

public class FibonacciCubeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		fiboNum(n);
	}

	private static void fiboNum(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		int sum=0;
        
	    System.out.println("Fibonacci Series Upto " + n + ": ");
	    
	    while (secondTerm < n) {
//	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	      sum += (nextTerm*nextTerm*nextTerm);
		    System.out.println(nextTerm+" ");
	    }
	    System.out.println(sum);
}
}