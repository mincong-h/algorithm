public class Solution {

    public int romanToInt(String s) {

        int[] tokens = new int[s.length()];
        int result = 0;

        // cast chars to ints
        for (int i = 0; i < s.length(); i++) {
            tokens[i] = castRoman(s.charAt(i));
        }

        // resolve ints to int
        int leftToken = tokens[0];
        for (int i = 0; i < tokens.length; i++) {
            result += tokens[i];
            if (leftToken < tokens[i]) {
                result -= leftToken * 2;
            }
            leftToken = tokens[i];
        }
        return result;
    }

    private int castRoman(char roman) {
        switch(roman) {
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;
            default : return 0;
        }
    }
}
