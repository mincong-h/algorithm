class Solution {
    public int addDigits(int num) {
        int ret = 0;
        while (num > 0) {
            ret += num % 10;
            num /= 10;
        }
        return ret > 9 ? addDigits(ret) : ret;
    }
}
