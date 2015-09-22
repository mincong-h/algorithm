package com.leetcode.easy;
/*
 * Write a function that takes an unsigned integer and returns the 
 * number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 
 * 00000000000000000000000000001011, so the function should return 3.
 *
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOfOneBits {

	public static void main(String[] args) {
		System.out.println("15 has " + hammingWeight(15) + " '1' bits");	// n=4
		System.out.println("3 has " + hammingWeight(3) + " '1' bits");		// n=2
		System.out.println("16 has " + hammingWeight(16) + " '1' bits");	// n=1
	}
	
	// you need to treat n as an unsigned value
	static int hammingWeight(int n) {
		int weight = 0;
		String bstr = Integer.toBinaryString(n);
		for(int i = 0; i < bstr.length(); i++) {
			if(bstr.charAt(i) == '1') weight ++;
		}
		return weight++;
	}
}