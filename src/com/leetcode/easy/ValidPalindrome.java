package com.leetcode.easy;

/*
 * Given a string, determine if it is a palindrome, considering
 * only alphanumeric characters and ignoring cases. For example,
 *   "A man, a plan, a canal: Panama" is a palindrome.
 *   "race a car" is not a palindrome. 
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		if(isPalindrome("drow word"))
			System.out.println("true");
		else
			System.out.println("false");

	}
	
	/* O(n) runtime, O(1) space */
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			//
			//while(!Character.isLetterOrDigit(s.charAt(i))) i++;
			//while(!Character.isLetterOrDigit(s.charAt(j))) j--;
			//
			// We need to ensure i is strictly less than j
			while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
			while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
			if(Character.toLowerCase(s.charAt(i))
				!= Character.toLowerCase(s.charAt(j)))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
