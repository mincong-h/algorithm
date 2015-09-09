package com.qq.test;
/**
 *          A + B - 9 = 4
 *  3x3     +   -   -
 *  Matrix: D - E x F = 4
 *          /   x   -
 *          G + H - I = 4
 *          =   =   =
 *          4   4   4
 *  
 *  Matrix = ?
 *  
 */
public class Matrix {

	public static void main(String[] args) {
			
		// initialize condition
		long start = System.currentTimeMillis();
		int[] range = new int[101];
		for(int i=0; i<101; i++) range[i] = i;
		
		// Matrix solution S will be as :
		//
		//     / s11 s12 s13 \
		// S = | s21 s22 s23 |
		//     \ s31 s32 s33 /
		//
		
		// calculations
		for(int x23: range){
			for(int x33: range) {
				
				// calculate column 3
				if(9-x23-x33 == 4) {
					for(int x11: range) {
						for(int x12: range) {
							
							// calculate row 1
							if(x11+x12-9 == 4) {
								for(int x21: range) {
									for(int x22: range) {
										
										// calculate row 2
										if(x21-(x22*x23) == 4) {
											for(int x32: range) {
												
												// calculate column 2
												if(x12-(x22*x32) == 4) {
													for(int x31: range) {
														
														// calculate column 1
														if(x31 != 0 && x11+(x21/x31) == 4) {
															
															//calculate row 3
															if(x31+x32-x33 == 4){
																
																System.out.printf("%d %d %d\n", x11, x12, 9);
																System.out.printf("%d %d %d\n", x21, x22, x23);
																System.out.printf("%d %d %d\n\n", x31, x32, x33);
																
															}
														}
													}
												}
											}					
										}
									}
								}
							}
						}
					}
				}
			}
		}

		// wait for activity here
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end-start) + "ms");
	}
}