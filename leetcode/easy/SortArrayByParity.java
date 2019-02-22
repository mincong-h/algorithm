class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int x = 0;
        int y = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[x] = A[i];
                x++;
            } else {
                B[y] = A[i];
                y--;
            }
        }
        return B;
    }
}
