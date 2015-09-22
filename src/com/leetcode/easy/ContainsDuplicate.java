package com.leetcode.easy;

import java.util.Hashtable;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice 
 * in the array, and it should return false if every element is distinct.
 * 
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2};
		if(containsDuplicate(null))
			System.out.println("contains duplicate");
		else
			System.out.println("does not contains duplicate");

	}
	static boolean containsDuplicate(int[] nums) {
		Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
		for(int num : nums) {
			if(map.containsKey(num))
				return true;
			else
				map.put(num, 1);
		}
		return false;
	}
}
