public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> missingRanges = new ArrayList<>();
        if (nums.length == 0) {
            if (upper > lower) {
                missingRanges.add(String.format("%d->%d", lower, upper));
            } else {
                missingRanges.add(String.format("%d", lower));
            }
            return missingRanges;
        }

        for (int i = 0; i < nums.length; i++) {

            // first element
            if (i == 0) {
                if (nums[i] - lower > 1) {
                    missingRanges.add(String.format("%d->%d", lower, nums[i] - 1));
                }
                if (nums[i] - lower == 1) {
                    missingRanges.add(String.format("%d", lower));
                }
            }

            // last element
            if (i == nums.length - 1) {
                if (upper - nums[i] > 1) {
                    missingRanges.add(String.format("%d->%d", nums[i] + 1, upper));
                }
                if (upper - nums[i] == 1) {
                    missingRanges.add(String.format("%d", upper));
                }
            } else {
                if (nums[i + 1] - nums[i] > 2) {
                    missingRanges.add(String.format("%d->%d", nums[i] + 1, nums[i + 1] - 1));
                }
                if (nums[i + 1] - nums[i] == 2) {
                    missingRanges.add(String.format("%d", nums[i] + 1));
                }
            }
        }
        return missingRanges;
    }
}
