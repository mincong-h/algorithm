public class Solution {

    private static int[] solutions = new int[]{ 0, 0, 1, 2 };

    public int integerBreak(int n) {
        if (n < 4) return solutions[n];
        if (n % 3 == 1) return (int) Math.pow(3, (n - 4) / 3) * 4;
        if (n % 3 == 2) return (int) Math.pow(3, (n - 2) / 3) * 2;
        return (int) Math.pow(3, n / 3);
    }
}
