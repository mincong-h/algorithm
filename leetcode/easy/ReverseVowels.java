class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int len = s.length();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (vowels.indexOf(arr[i]) >= 0
                && vowels.indexOf(arr[j]) >= 0) {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            } else {
                while (i < len && vowels.indexOf(arr[i]) < 0) {
                    i++;
                }
                while (j > 0 && vowels.indexOf(arr[j]) < 0) {
                    j--;
                }
            }
        }
        return new String(arr);
    }
}
