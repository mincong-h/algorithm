/**
 * {@link https://leetcode.com/problems/third-maximum-number/}
 */
public class Solution {

    public int thirdMax(int[] nums) {

        Integer top1 = null;
        Integer top2 = null;
        Integer top3 = null;

        for (int num : nums) {
            // Redefine top1
            if (top1 == null || num > top1) {
                top3 = top2;
                top2 = top1;
                top1 = num;
                continue;
            }
            if (top1 == num)
                continue;

            // Redefine top2
            if (top2 == null || num > top2) {
                top3 = top2;
                top2 = num;
                continue;
            }
            if (top2 == num)
                continue;

            // Redefine top3
            if (top3 == null || num > top3) {
                top3 = num;
                continue;
            }
        }
        return top3 == null ? top1 : top3;
    }
}
