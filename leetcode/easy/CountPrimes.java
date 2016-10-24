/**
 * Written on whiteboard. 30 mins, 2 submissions.
 * {@link https://leetcode.com/problems/count-primes/}
 * Company tags: Amazon, Microsoft.
 */
public class Solution {
    public int countPrimes(int n) {

        boolean[] isComposite = new boolean[n];
        int primeCount = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) { // isPrime
                primeCount++;
                // The multiples of i are not prime.
                for (int j = i * 2; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return primeCount;
    }
}
