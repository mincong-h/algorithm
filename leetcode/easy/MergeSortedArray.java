package com.leetcode.easy;

/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into 
 * nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater 
 * or equal to m + n) to hold additional elements from nums2. The number 
 * of elements initialized in nums1 and nums2 are m and n respectively.
 * 
 * https://leetcode.com/problems/merge-sorted-array/
 */

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[8];
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		nums1[3] = 9;
		int[] nums2 = {4, 5, 6, 8};
		merge(nums1, 4, nums2, 4);
		for(int i = 0; i < 8; i++) {
			System.out.printf("%d ", nums1[i]);
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0) {
			// nothing to do
		} else {
			int i = 0, j = 0;
			int[] nums = new int[m + n];
			while(i <= m && j <= n && i + j < m + n) {
				System.out.printf("(%d, %d)\n", i, j);
				if(i == m) {
					nums[i + j] = nums2[j];
					j++;
					continue;
				}
				if(j == n){	 
					nums[i + j] = nums1[i];
					i++;
					continue;
				}
				if (nums1[i] > nums2[j] && j < n) {
					nums[i + j] = nums2[j];
					j++;
				} else {	 
					nums[i + j] = nums1[i];
					i++;
				}
			}
			for(int num = 0; num < m + n; num++)
				nums1[num] = nums[num];
		}
	}

}
