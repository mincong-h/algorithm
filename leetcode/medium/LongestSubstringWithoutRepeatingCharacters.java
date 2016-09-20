public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> chars = new HashSet<>();
        while (end < s.length()) {
            if (chars.contains(s.charAt(end))) {
                chars.remove(s.charAt(start));
                start++;
            } else {
                chars.add(s.charAt(end));
                maxLength = Math.max(maxLength, chars.size());
                end++;
            }
        }
        return maxLength;
    }
}
