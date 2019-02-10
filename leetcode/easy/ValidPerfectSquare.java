class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int sum = 0;
        while (i < Integer.MAX_VALUE && sum < num) {
            sum += i;
            i += 2;
        }
        return sum == num;
    }
}
