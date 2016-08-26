package com.leetcode.easy;

import java.util.Hashtable;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 2;
		if(isHappy(n))
			System.out.println(n + " is a happy number");
		else
			System.out.println(n + " is not a happy number.");

	}
	
	// stack over flow
	public static boolean isHappy0(int n) {
		String s = String.valueOf(n); // stack over flow here.
		int sumOfSqr = 0;
		for(int i = 0; i < s.length(); i++) {
			sumOfSqr += Character.getNumericValue(s.charAt(i)) * Character.getNumericValue(s.charAt(i));
		}
		if(sumOfSqr == 0) return false;
		else if(sumOfSqr == 1) return true;
		else return isHappy0(sumOfSqr);
    }
	
	// second try, inspired from
	// - How to get the separate digits of an int number? http://stackoverflow.com/questions/3389264/how-to-get-the-separate-digits-of-an-int-number
	// - Way to get number of digits in an int? http://stackoverflow.com/questions/1306727/way-to-get-number-of-digits-in-an-int
	public static boolean isHappy(int n) {
		Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
		// if sum is different from the initial value of n, called n0
		// than the program keep on to check whether this n will be a
		// happy number
		do {
			map.put(n, 1);
			int sum = 0;
			System.out.println(n);
			if(n > 1) {
				while(n > 0) {
					sum += Math.pow((double) n % 10, 2);
					n /= 10;
				}
				n = sum;
			}
			if(n == 1) return true;
		} while(!map.containsKey(n));
		return false;
	}
}
