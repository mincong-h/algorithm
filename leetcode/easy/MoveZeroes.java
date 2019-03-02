class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            while (fast < nums.length && nums[fast] == 0) {
                fast++;
            }
            if (fast == nums.length) {
                break;
            }
            nums[slow] = nums[fast];
            slow++;
            fast++;
        }
        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }
}
