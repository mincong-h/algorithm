class Solution {
    public boolean isMonotonic(int[] A) {
        int order = 0; // 1: increase, 0: unknown, -1: decrease
        int prev = A[0];
        for (int i = 1; i < A.length; i++) {
            int curr = A[i];
            if (order == 0) {
                if (curr > prev) {
                    order = 1;
                } else if (curr < prev) {
                    order = -1;
                }
            } else if (order > 0) {
                if (curr < prev) {
                    return false;
                }
            } else {  // order < 0
                if (curr > prev) {
                    return false;
                }
            }
            prev = curr;
        }
        return true;
    }
}
