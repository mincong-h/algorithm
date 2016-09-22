public class Solution {

    public String longestPalindrome(String s) {

        if (s == null) return null;

        String palindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = extendPalindrome(s, i, i);
            String evn = extendPalindrome(s, i, i + 1);
            if (odd.length() > palindrome.length()) palindrome = odd;
            if (evn.length() > palindrome.length()) palindrome = evn;
        }
        return palindrome;
    }

    /**
     * Extend the indexes at both ends of the string and
     * try to find out the longest palindrome.
     *
     * @param s target string to extend
     * @param startIndex start index
     * @param endIndex end index
     * @return the palindrome
     */
    private String extendPalindrome(String s, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex < s.length()
                && s.charAt(startIndex) == s.charAt(endIndex)) {
            startIndex--;
            endIndex++;
        }
        return s.substring(startIndex + 1, endIndex);
    }
}
