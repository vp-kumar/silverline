package com.rtjvm.java.lectures.codetest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciGenerator {
	
	
	/**
	 * To get the nth value in the fibonacci sequence
	 * @param n
	 * @return
	 */
	public static BigInteger getFibonacciValue(int n) {

        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous =BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {

            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }
	
	/**
	 * To get the fibonacci sequence up to the limit n
	 * @param n
	 * @return
	 */
	public static List<BigInteger> getFibonacciSequence(int n){
		List<BigInteger> sequence = new ArrayList<BigInteger>();
		for (int i = 0; i < n; i++) {			  
			sequence.add(getFibonacciValue(i));
		 }		
		return sequence;
		
	}

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {

        	BigInteger val = getFibonacciValue(i);
            System.out.print(val + "\t");
        }
        
        System.out.println("To get sequence");
        Arrays.asList(getFibonacciSequence(n)).forEach(System.out::println);
       
    }

}
