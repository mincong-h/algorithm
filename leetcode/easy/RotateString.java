class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.length() == 0) {
            return true;
        }
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(0) == B.charAt(i) && isSame(A, B, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSame(String A, String B, int offset) {
        for (int i = 1; i < A.length(); i++) {
            int j = i + offset;
            if (j >= B.length()) {
                j -= B.length();
            }
            if (A.charAt(i) != B.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
