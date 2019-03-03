class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int acc = sum + nums[i];
            sum = acc > nums[i] ? acc : nums[i];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
