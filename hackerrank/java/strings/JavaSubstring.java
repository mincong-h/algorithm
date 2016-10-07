import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * {@link https://www.hackerrank.com/challenges/java-substring}
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if (S != null) {
            System.out.println(S.substring(start, end));
        }
    }
}
