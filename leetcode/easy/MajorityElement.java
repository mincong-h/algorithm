package com.leetcode.easy;

import java.util.Hashtable;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {3, 3, 4};
		System.out.println(majorityElement(nums));
	}
	
    public static int majorityElement(int[] nums) {
    	// TODO: my algorithm is not good enough. It must have better way to 
    	// handle this problem. 
    	Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
    	for(int num : nums) {
    		if(map.containsKey(num)) {
    			map.put(num, map.get(num) + 1);
    			if(map.get(num) > nums.length/2)
    				return num;
    		} else {
    			map.put(num, 1);
    		}
    		System.out.println(map.toString());
    	}
    	// if the program didn't find out the result, it means that the 
    	// result is the last one. So return it.
        return nums[nums.length - 1];
    }
}
