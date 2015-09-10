package com.leetcode.easy;

import java.util.Hashtable;

/*
 * Two Sum
 * 
 * Given an array of integers, find two numbers such that they add up a 
 * specific target number.
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less then index2. Please
 * note the your returned answers (both index1 and index2) are nor zero-
 * based.
 * You may assume that each input would have exactly one solution.
 * 
 * https://oj.leetcode.com/problems/two-sum
 * 
 */

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 9, 12, 8, 27, 44};
		int[] result = getTwoSum(numbers, 28);
		for (int i : result) System.out.println(i);
	}
	
	/* O(n) runtime, O(n) space - Hash table */
	public static int[] getTwoSum(int[] numbers, int target) {
		Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
		for (int i=0; i<numbers.length; i++) {
			int v = numbers[i];
			// I used containsValue method for the if condition
			// at the first time, but I then realized I cannot
			// return the key of (target-v) in the hash table
			// so the solution is to inverse the K, V pair : 
			//     (_K, _V) => (V, K)
			// if two V have the same value, K will be replaced
			if (map.containsKey(target-v)) {
				// The following condition is unnecessary because i
				// must be greater than map.get(target-v) as it is
				// being incremented and always the greatest one.
				//return (v < target-v) ? new int[] {i, map.get(target-v)} : new int[] {map.get(target-v), i};
				return new int[] {map.get(target-v), i};
			}
			map.put(v, i);
		}
		return null;
	}

}
