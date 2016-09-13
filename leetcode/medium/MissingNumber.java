public class Solution {
    public int missingNumber(int[] nums) {
        // sum of an arithmetic sequence = (first + last) * nb / 2;
        int expectedSum = (0 + nums.length) * (nums.length + 1) / 2;
        int realSum = 0;
        for (int num : nums) {
            realSum += num;
        }
        return expectedSum - realSum;
    }
}
