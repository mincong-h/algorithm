public class Solution {
    public List<String> generatePossibleNextMoves(String s) {

        List<String> solutions = new LinkedList<>();
        if (s == null || s.length() < 2) {
            return solutions;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '-') {
                continue;
            } else {
                // chars[i] is '+', what about chars[i + 1]? 
                if (chars[i + 1] == '+') {
                    char[] solution = chars.clone();
                    solution[i] = '-';
                    solution[i + 1] = '-';
                    solutions.add(new String(solution));
                } else {
                    // we know that char[i + 1] is not good already
                    // so the next loop can be skipped
                    i++;
                }
            }
        }
        return solutions;
    }
}
