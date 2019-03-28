class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    /**
     * Whether the substring of string {@code s} is palindrome.
     *
     * @param s the string to validate
     * @param left the left index (inclusive)
     * @param right the right index (inclusive)
     * @return if the substring is palindrome
     */
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
