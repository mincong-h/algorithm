public class Solution {

    private final String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder("");
        int i = 0;

        while (num > 0) {
            if (num >= VALUES[i]) {
                sb.append(ROMANS[i]);
                num -= VALUES[i];
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
