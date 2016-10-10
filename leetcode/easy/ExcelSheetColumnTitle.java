public class Solution {
    public String convertToTitle(int n) {
        String title = "";
        while (n > 0) {
            char c = (char)('A' + (n - 1) % 26);
            title = c + title;
            n = (n - 1) / 26;
        }
        return title;
    }
}
