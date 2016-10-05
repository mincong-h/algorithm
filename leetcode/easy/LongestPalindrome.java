public class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[52];
        int longestPalindrome = 0;
        for (char c : s.toCharArray()) {
            // insert current value into charCount
            int i = (int) c - 'A';
            if (i > 25) i = (int) c - 'a' + 26;
            charCount[i] += 1;
            if (charCount[i] == 2) {
                longestPalindrome += 2;
                charCount[i] = 0;
            }
        }
        for (int count : charCount) {
            if (count == 1) {
                return longestPalindrome + 1;
            }
        }
        return longestPalindrome;
    }
}
