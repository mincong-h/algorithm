class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        int[] todoTable = new int[128];
        for (char c : p.toCharArray()) {
            todoTable[c]++;
        }
        int left = 0;
        int right = 0;
        int todo = p.length();
        while (right < s.length()) {
            if (todoTable[s.charAt(right)] > 0) {
                todo--;
            }
            todoTable[s.charAt(right)]--;
            right++;

            if (todo == 0) {
                list.add(left);
            }
            if (right - left == p.length()) {
                if (todoTable[s.charAt(left)] >= 0) {
                    todo++;
                }
                todoTable[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }
}
