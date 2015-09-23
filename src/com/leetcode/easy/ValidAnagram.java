package com.leetcode.easy;

import java.util.Arrays;

/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * 
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {

	public static void main(String[] args) {
		if(isAnagram("a", "ab"))
			System.out.println("It is anagram.");
		else
			System.out.println("Is is not anagram.");

	}
	
	static boolean isAnagram(String s, String t) {
		if(s!=null && t!= null) {
			char[] _s = s.toCharArray();
			char[] _t = t.toCharArray();
			Arrays.sort(_s);
			Arrays.sort(_t);
			int i = 0;
			if(_s.length == _t.length) {
				while(i < _s.length && i < _t.length) {
					if(_s[i] != _t[i])
						return false;
					i++;
				}
			} else {
				return false;
			}
		}
		return true;
	}
}
