public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '{' ||
                s.charAt(i) == '[') {
                parentheses.push(s.charAt(i));
            } else if (!parentheses.isEmpty() && isPair(parentheses.peek(), s.charAt(i))) {
                parentheses.pop();
            } else {
                return false;
            }
        }
        return parentheses.isEmpty();
    }

    private boolean isPair(char left, char right) {
        if ((left == '(' && right == ')') ||
            (left == '[' && right == ']') ||
            (left == '{' && right == '}')) {
            return true;
        }
        return false;
    }
}
