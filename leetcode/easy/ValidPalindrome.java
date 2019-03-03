class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isAlphanum(s.charAt(i))) {
                i++;
            } else if (!isAlphanum(s.charAt(j))) {
                j--;
            } else {
                char a = s.charAt(i);
                if ('A' <= a && a <= 'Z') {
                    // to lower case
                    a = (char)((int)(a - 'A') + (int)'a');
                }
                char b = s.charAt(j);
                if ('A' <= b && b <= 'Z') {
                    // to lower case
                    b = (char)((int)(b - 'A') + (int)'a');
                }
                if (a != b) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isAlphanum(char c) {
        return 'A' <= c && c <= 'Z'
            || 'a' <= c && c <= 'z'
            || '0' <= c && c <= '9';
    }
}
