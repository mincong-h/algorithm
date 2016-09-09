public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int divider = 1;
        while (x / divider >= 10) {
            divider *= 10;
        }

        while (x != 0) {
            // if left digit != right digit
            if (x / divider != x % 10) {
                return false;
            }
            // right digit ++ and left digit --
            x = (x % divider) / 10;
            divider /= 100;
        }
        return true;
    }
}
