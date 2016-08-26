package com.leetcode.easy;

/*
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class TrailingZeroes {
	
    public static int getZeroes(int n) {
    	int A = (int)(Math.log(n) / Math.log(5));
        int number = 0;	// number of five
        int a = 1;		// order of five
        while(a <= A) {
            number += (int) n / Math.pow(5, a);
            a++;
        }
        return number;
    }
    
    public static void main(String[] args) {
		int i = getZeroes(50);
		System.out.println(i);
	}
}