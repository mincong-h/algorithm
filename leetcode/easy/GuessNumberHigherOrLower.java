public class Solution extends GuessGame {

    public int guessNumber(int n) {

        int upper = n;
        int lower = 1;
        int mid = lower + (upper - lower) / 2;

        while (upper > lower) {
            switch (guess(mid)) {
                case 0 : return mid;
                case 1 : lower = mid + 1; break;
                case -1 : upper = mid; break;
            }
            // avoid stack overflow
            mid = lower + (upper - lower) / 2;
        }
        return mid;
    }
}
