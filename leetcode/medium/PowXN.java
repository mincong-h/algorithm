public class Solution {
    public double myPow(double x, int n) {
        if (n == 0)      { return 1; }
        else if (n == 1) { return x; }
        else if (n == 2) { return x * x; }
        else if (n > 2)  { return myPow(x * x, n / 2) * myPow(x, n % 2); }
        else             { return 1 / (myPow(x * x, - (n / 2)) * myPow(x, - (n % 2))); }
    }
}
