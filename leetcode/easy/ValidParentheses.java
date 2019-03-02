class Solution {
    public boolean isValid(String s) {
        Stack<Character> openStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                openStack.push(c);
            } else {
                if (openStack.empty()) {
                    return false;
                }
                char l = openStack.pop();
                if (l == '(' && c == ')' ||
                    l == '{' && c == '}' ||
                    l == '[' && c == ']') {
                    continue;
                }
                return false;
            }
        }
        return openStack.empty();
    }
}
