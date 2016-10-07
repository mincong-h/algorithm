import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * {@link https://www.hackerrank.com/challenges/java-2d-array}
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum[][] = new int[4][4];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
                add(sum, arr[i][j], i - 2, j - 2);
                add(sum, arr[i][j], i - 2, j - 1);
                add(sum, arr[i][j], i - 2, j - 0);
                add(sum, arr[i][j], i - 1, j - 1);
                add(sum, arr[i][j], i - 0, j - 2);
                add(sum, arr[i][j], i - 0, j - 1);
                add(sum, arr[i][j], i - 0, j - 0);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                max = Math.max(sum[i][j], max);
            }
        }
        System.out.println(max);
    }

    private static void add(int[][] sum, int val, int i, int j) {
        if (i >= 0 && j >= 0 && i < 4 && j < 4) {
            sum[i][j] += val;
        }
    }
}

