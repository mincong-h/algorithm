package com.leetcode.easy;

/*
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements. For 
 * example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 * nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array. Minimize 
 * the total number of operations.
 * 
 * https://leetcode.com/problems/move-zeroes/
 */

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 8, 9, 0};
		moveZeroes(nums);
		for(int num : nums)
			System.out.printf("%d ", num);
	}
	
	public static void moveZeroes(int[] nums){
		int middle;
		int right = nums.length - 1;
		do {
			// We begin at the right side, if the right end number
			// if it is equal to 0, than decrement until it is not
			// equal to 0. End the program if the left end is 
			// reached.
			while(nums[right] == 0) { 
				if(right > 0) right--; else	return;
			}
			// Than we continue to look up new value. This time, 
			// the right end number should equal to zero again. It
			// would be the first 0 the be sorted. End the program
			// if the left end is reached.
			middle = right;
			while(nums[middle] != 0 ) {
				if(middle > 0) middle--; else return;
			}
			// Now we have found the first 0 value to be sorted. We
			// will move it the right end be changing the values'
			// positions
			for(int i = middle; i <= right; i++)
				nums[i] = (i < right) ? nums[i + 1] : 0;
			
		// A zero-move finished. Go to the next zero-move
		} while (right > 0);
	}
}
