public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summaries = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return summaries;
        }
        int start = nums[0];
        int end = nums[0];
        for (int num : nums) {
            if (num > end + 1) {
                String summary = end > start ? start + "->" + end : start + "";
                summaries.add(summary);
                // reset
                start = num;
                end = num;
            } else {
                end = num;
            }
        }
        String summary = end > start ? start + "->" + end : start + "";
        summaries.add(summary);
        return summaries;
    }
}
