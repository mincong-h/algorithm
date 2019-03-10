class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> nearbyNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (nearbyNums.containsKey(num)) {
                if (i - nearbyNums.get(num) <= k) {
                    // duplicate
                    return true;
                }
            }
            nearbyNums.put(num, i);
        }
        return false;
    }
}
