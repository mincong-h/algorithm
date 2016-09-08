public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        String ref = strs[0];
        int charIdx = 0;

        while (charIdx < ref.length()) {
            for (int i = 1; i < strs.length; i++) {
                if (charIdx >= strs[i].length()) {
                    return ref.substring(0, charIdx);
                }
                if (strs[i].charAt(charIdx) != ref.charAt(charIdx)) {
                    return ref.substring(0, charIdx);
                }
            }
            charIdx++;
        }
        return ref;
    }
}
