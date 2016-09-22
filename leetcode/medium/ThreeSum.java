public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new LinkedList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 2; a++) {
            if (a == 0 || (a > 0 && nums[a] != nums[a - 1])) {
                int b = a + 1;
                int c = nums.length - 1;
                while (b < c) {
                    if (nums[a] + nums[b] + nums[c] == 0) {
                        sums.add(Arrays.asList(nums[a], nums[b], nums[c]));
                        while (b < c && nums[b + 1] == nums[b]) b++;
                        while (b < c && nums[c - 1] == nums[c]) c--;
                        b++; c--;
        
                    // b is too small
                    } else if (nums[a] + nums[b] + nums[c] < 0) {
                        while (b < c && nums[b + 1] == nums[b]) b++;
                        b++;
        
                    // c is too big
                    } else {
                        while (b < c && nums[c - 1] == nums[c]) c--;
                        c--;
                    }
                }
            }
        }
        return sums;
    }
}
