/**
 * Written in Google Doc. 50 mins, 2 submissions.
 * {@link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/}
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        while (i < numbers.length && numbers[i] <= target) {
            int diff = target - numbers[i];
            int j = Arrays.binarySearch(numbers, i + 1, numbers.length, diff);
            if (j >= 0) {
                return new int[]{i + 1, j + 1};
            }
            i++;
         }
         return new int[0]; // not found
     }
}
