package com.leetcode.easy;

/*
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		if(isPowerOfTwo(536870912)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
	
	static boolean isPowerOfTwo(int n) {
		if(n > 0) {
			double quotient = Math.log(n) / Math.log(2);
			System.out.println(quotient);
			return (quotient - (int)quotient < Math.pow(10, -9)) ? true : false;
		} else {
			return false;
		}
	}

}
