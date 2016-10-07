import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * {@link https://www.hackerrank.com/challenges/java-string-compare}
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        if (s == null || s.length() < k) return;

        String max = s.substring(0, k);
        String min = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            if (substr.compareTo(max) > 0) {
                max = substr;
            }
            if (substr.compareTo(min) < 0) {
                min = substr;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
