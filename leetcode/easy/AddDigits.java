package com.leetcode.easy;

/*
 * Add Digits
 * 
 * Given an array of integers, find two numbers such that they add up a
 * Given a non-negative integer num, repeatedly add all its digits until
 * the result has only one digit. For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 
 * has only one digit, return it.
 * 
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 * 
 * https://leetcode.com/problems/add-digits/
 * 
 */

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}
	
	/* O(1) runtime */
	public static int addDigits(int num) {
		// As a num abc is equal to (a*100 + b*10 + c)
		// so if we want to calculate a + b + c, it would be 
		//     a*100 + b*10 + c
		// - ( a* 99 + b* 9 + 0)
		// ---------------------
		//     a     + b    + c   = sumIntermediate
		// so the result is the modulo of 9. The same way for sumIntermediate (a+b+c)
		// num % 9 will be the answer, except the case when positive num's modulo
		// equals 9
		return (num%9==0 && num>0) ? 9 : num%9;
	}
}
