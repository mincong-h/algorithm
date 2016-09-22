public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        for (int h = 0;; h++) {
            for (int n = 0;; n++) {
                if (n == needle.length()) return h;
                if (h + n >= haystack.length()) return -1; // not found
                if (haystack.charAt(h + n) != needle.charAt(n)) break; // not matched, next h
            }
        }
    }
}
