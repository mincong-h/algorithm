public class Solution {
    public int lengthLongestPath(String input) {

        Stack<Integer> longestPath = new Stack<>();
        int maxLength = 0;

        for (String line : input.split("\n")) {
            int level = line.lastIndexOf('\t') + 1; // level = number of '\t'
            // remove exiting files of the same level
            while (longestPath.size() > level) {
                longestPath.pop();
            }
            int parentLen = longestPath.empty() ? 0 : longestPath.peek();
            int len = parentLen + line.length() - level + 1; // exclude prefix(es) '\t', add '/'
            longestPath.push(len);
            // check if it is file
            if (line.contains(".")) {
                maxLength = Math.max(maxLength, len - 1);
            }
        }
        return maxLength;
    }
}
