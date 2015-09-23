package com.leetcode.easy;
/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct 
 * ways can you climb to the top?
 * 
 * Helpful link
 * http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 * 
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
    public static int climbStairs(int n) {
    	// set the solution array for the number of ways that 
    	// can be reached at each step @i. e.g. when i = 1, 
    	// waysTo[0] represent the number of ways to the stair 
    	// 0.
    	if(n > 1) {
	    	int[] waysTo = new int[n + 1];
	        waysTo[0] = 1;								// ways to reach stair 0
	        waysTo[1] = 1;								// ways to reach stair 1
	        for(int i = 2; i <= n; i++) {
	        	waysTo[i] = waysTo[i-1] + waysTo[i-2];	// ways to reach stair i
	        	System.out.println(waysTo[i]);
	        }
	        System.out.println("---");
			return waysTo[n];
    	} else {
    		return 1;
    	}
    }
}
