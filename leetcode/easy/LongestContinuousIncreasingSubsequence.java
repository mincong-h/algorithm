class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currLen++;
            } else {
                // reset
                if (maxLen < currLen) {
                    maxLen = currLen;
                }
                currLen = 1;
            }
        }
        if (maxLen < currLen) {
            maxLen = currLen;
        }
        return maxLen;
    }
}
