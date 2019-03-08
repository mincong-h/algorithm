class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        C: for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    break C;
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }
}
