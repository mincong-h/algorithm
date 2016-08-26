package com.leetcode.easy;

/*
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include
 * 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it 
 * includes another prime factor 7. Note that 1 is typically treated 
 * as an ugly number.
 * 
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumber {

	public static void main(String[] args) {
		if(isUgly(1)) {
			System.out.println("ugly");
		} else {
			System.out.println("not ugly");
		}

	}
	
	static boolean isUgly (int num) {
		if(num > 0) {
			// if the number is different from 2, 3, 5 and greater than
			// 0, than we know if it can be divided by 2, 3, 5 without 
			// modulo. if it can't, it means it is ugly. Else, try do 
			// reduce the number and repeat the while loop.
			while(num > 1 && num != 2 && num != 3 && num != 5) {
				if(num%2 != 0 && num%3 != 0 && num%5 != 0) {
					return false;
				}
				if(num%2 == 0) { num /= 2; }
				else if(num%3 == 0) { num /= 3; }
				else if(num%5 == 0) { num /= 5; }
			}
			return true;
		} else {
			return false;
		}
	}

}
