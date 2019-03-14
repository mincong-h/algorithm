class Solution {
    public int titleToNumber(String s) {
        // ABC:
        // A * 26^2 + B * 26^1 + C * 26^0
        int ret = 0;
        int pow = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int x = (int)(s.charAt(i) - 'A' + 1);
            ret += x * pow;
            pow *= 26;
        }
        return ret;
    }
}
