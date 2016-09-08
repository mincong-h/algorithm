public class Solution {
    public String countAndSay(int n) {

        StringBuilder seqBuilder = new StringBuilder("1");
        String prev = "1";
        int i = 1;

        while (i < n) {

            seqBuilder = new StringBuilder();
            char c = prev.charAt(0);
            int count = 0;

            for (int x = 0; x < prev.length(); x++) {
                if (prev.charAt(x) == c) {
                    count++;
                } else {
                    // append & reset character
                    seqBuilder.append(count).append(c);
                    c = prev.charAt(x);
                    count = 1;
                }
            }

            // append & reset previous sequence
            seqBuilder.append(count).append(c);
            prev = seqBuilder.toString();
            i++;
        }
        return seqBuilder.toString();
    }
}
