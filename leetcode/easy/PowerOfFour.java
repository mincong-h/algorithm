public class Solution {

    /**
     * If num is power of four, then its binary expression can only have one
     * "1" digit and must locate in impair location, e.g.
     * 00000001 = 01
     * 00000100 = 04
     * 00010000 = 16
     * 01000000 = 32
     *
     * So we use a 32 bit mask to test the above behavior:
     * ..01010101 = mask (binary)
     * Ox55555555 = mask (hex)
     */
    public boolean isPowerOfFour(int num) {
        boolean isPowerOfTwo = (num & (num - 1)) == 0;
        return num > 0 && isPowerOfTwo && (num & 0x55555555) != 0;
    }
}
