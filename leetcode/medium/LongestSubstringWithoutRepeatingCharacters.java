class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] stock = new int[128];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = 1;
        }

        int left = 0;
        int right = 0;
        int maxLen = 0;
        int len = 0;

        while (right < s.length()) {
            if (stock[s.charAt(right)] > 0) {
                stock[s.charAt(right)]--;
                len++;
                if (maxLen < len) {
                    maxLen = len;
                }
                right++;
            } else {
                stock[s.charAt(left)]++;
                len--;
                left++;
            }
        }
        return maxLen;
    }
}
