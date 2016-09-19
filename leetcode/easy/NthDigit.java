public class Solution {
    public int findNthDigit(int n) {
        // 1x9; 2x90; 3x900; 4x9000 ...
        // 1x1x9; 2x10x9; 3x100x9; 4x1000x9 ...
        n -= 1;
        int digits = 1;
        long first = 1;
        while (n > digits * first * 9) {
            n -= digits * first * 9;
            digits++;
            first *= 10;
        }
        return String.valueOf(first + n / digits).charAt(n % digits) - '0';
    }
}
