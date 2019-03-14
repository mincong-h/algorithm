class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int realSum = 0;
        for (int num : nums) {
            realSum += num;
        }
        return expectedSum - realSum;
    }
}
