class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int currLen = 0;
        for (int num : nums) {
            if (num == 0) {
                currLen = 0;
            } else {
                currLen++;
                if (maxLen < currLen) {
                    maxLen = currLen;
                }
            }
        }
        return maxLen;
    }
}
