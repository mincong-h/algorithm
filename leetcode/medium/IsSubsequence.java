public class Solution {
    public boolean isSubsequence(String s, String t) {
        int prevIndex = -1;
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c, prevIndex + 1);
            if (index == -1) {
                return false;  // not found
            } else {
                prevIndex = index;
            }
        }
        return true;
    }
}
