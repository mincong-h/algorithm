class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c * 1.0);
        while (a <= b) {
            int sum = a * a + b * b;
            if (sum == c) {
                return true;
            }
            if (sum > c) {
                b--;
            } else {
                a++;
            }
        }
        return false;
    }
}
