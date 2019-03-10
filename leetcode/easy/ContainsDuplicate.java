class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for (int num : nums) {
            if (uniq.contains(num)) {
                return true;
            } else {
                uniq.add(num);
            }
        }
        return false;
    }
}
