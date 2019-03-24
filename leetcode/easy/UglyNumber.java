class Solution {
    public boolean isUgly(int num) {
        int[] factors = {2, 3, 5};
        for (int i = 0; i < factors.length && num > 0; i++) {
            while (num % factors[i] == 0) {
                num /= factors[i];
            }
        }
        return num == 1;
    }
}
