package com.leetcode.easy;

public class TrailingZeroes {
	
    public static int getZeroes(int n) {
        int nFact = 1;
        int zeroes = 0;
        for(int i=1; i<=n; i++)
            nFact *= i;
        String str = Integer.toString(nFact);
        System.out.println(str);
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == '0')
                zeroes++;
        return zeroes;
    }
    
    public static void main(String[] args) {
		int i = getZeroes(10);
		System.out.println(i);
	}
}