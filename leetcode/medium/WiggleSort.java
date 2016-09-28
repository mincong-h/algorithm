public class Solution {
    public void wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            // if i is odd and the previous is greater than the current
            // if i is even and the previous is smaller than the current
            if ((i % 2 == 1 && prev > nums[i]) ||
                (i % 2 == 0 && prev < nums[i])) {
                nums[i - 1] = nums[i];
                nums[i] = prev;
            }
        }
    }
}
