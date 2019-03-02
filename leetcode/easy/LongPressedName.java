class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            char c = name.charAt(i);
            // same char in "name"? postpone check
            if (i + 1 < name.length() && name.charAt(i + 1) == c) {
                i++;
                j++;
            } else {
                // long pressed
                while (j < typed.length() && typed.charAt(j) == c) {
                    j++;
                }
                i++;
            }
        }
        return i == name.length() && j == typed.length();
    }
}
