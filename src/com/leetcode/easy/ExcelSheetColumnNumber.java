package com.leetcode.easy;

/*
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its 
 * corresponding column number. For example:
 *
 *    A -> 1
 *    B -> 2
 *    C -> 3
 *    ...
 *    Z -> 26
 *    AA -> 27
 *    AB -> 28
 *    
 * https://leetcode.com/problems/excel-sheet-column-number/
 */

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AB"));

	}
	
	// suppose they are upper cases
	static int titleToNumber(String s) {
		int num = 0;
		if(s!=null) {
			for(int i = 0; i < s.length(); i++) {
				num += (int) ((s.charAt(i) - 'A' + 1) * Math.pow(26, s.length()-i-1));
			}
			return num;
		}
		return 0;
	}
}
