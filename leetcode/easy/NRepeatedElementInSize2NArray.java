class Solution {
    /**
     * In 2N elements, the repeated element will appear at least once
     * every 2 elements. It means that when looking for group of 3
     * elements, then we must find group containing the repeated one.
     */
    public int repeatedNTimes(int[] A) {
        int a = A[A.length - 3];
        int b = A[A.length - 2];
        int c = A[A.length - 1];
        for (int i = 0; i < A.length; i++) {
            a = b;
            b = c;
            c = A[i];
            if (a == b) {
                return a;
            }
            if (b == c || a == c) {
                return c;
            }
        }
        // This should never happen
        return 0;
    }
}
