public class Solution {
    public boolean isPowerOfThree(int n) {
        double power = Math.log10(n) / Math.log10(3);
        return power == (int) power;
    }
}
