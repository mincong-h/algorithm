package com.leetcode.easy;

public class RmoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 2};
		System.out.println("main" + removeDuplicates(nums, 2));
		for(int n : nums) {
			System.out.printf("%d, ", n);
		}
	}
	
	static int removeDuplicates(int[] nums, int n) {
		int i = 0, j, offset;
		int length = nums.length;
		while(i < length) {
			offset = 0;
			// check offset j
			while((nums[i + offset] == n && i + offset < length)) offset++;
			// replace
			j = i;
			while(j + offset < length) {
				nums[j] = nums[j + offset];
				j++;
			}
			// increment
			i++;
			for(int num : nums) {
				System.out.printf("%d, ", num);
			}
			System.out.println("");
		}
		return nums.length;
	}

}
