class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        boolean cap = isUpper(word.charAt(0));
        boolean fullCap = cap && isUpper(word.charAt(1));
        if (fullCap) {
            for (int i = 2; i < word.length(); i++) {
                if (!isUpper(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (isUpper(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
