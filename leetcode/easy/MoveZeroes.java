class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }
}
