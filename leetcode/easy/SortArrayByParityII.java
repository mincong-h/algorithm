class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];
        int even = 1;
        int odd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[odd] = A[i];
                odd += 2;
            } else {
                B[even] = A[i];
                even += 2;
            }
        }
        return B;
    }
}
