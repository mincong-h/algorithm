package com.leetcode.easy;

import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5, 6, 7, 9};
		for(String r : summaryRanges(nums)) {
			System.out.println(r);
		}

	}
	public static List<String> summaryRanges(int[] nums) {
		List<String> ranges = null;
		String range;
		int i = 0, j = 0;
		int head = nums[i], tail = head;
		while(nums[i + j] == head + j && i + j <= nums.length) {
			tail = head + j;
			j++;
		}
		// set range
		range = head + "->" + tail;
		// add to the list
		ranges.add(range);
        return ranges;
    }

}
