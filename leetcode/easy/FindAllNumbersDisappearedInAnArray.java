class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] table = new int[nums.length + 1];
        for (int num : nums) {
            table[num] = 1;
        }
        List<Integer> results = new LinkedList<>();
        for (int i = 1; i < table.length; i++) {
            if (table[i] == 0) {
                results.add(i);
            }
        }
        return results;
    }
}
