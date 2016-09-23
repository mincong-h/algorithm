public class Solution {

    private static final String[] mapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        LinkedList<String> combinations = new LinkedList<>();
        if (digits.length() == 0) return combinations;
        combinations.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            while (combinations.peek().length() == i) {
                String removed = combinations.remove();
                for(char c : mapping[digit].toCharArray()) {
                    combinations.add(removed + c);
                }
            }
        }
        return combinations;
    }
}
