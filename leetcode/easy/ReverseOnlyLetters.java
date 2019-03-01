class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            boolean alphaI = (arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z');
            boolean alphaJ = (arr[j] >= 'A' && arr[j] <= 'Z') || (arr[j] >= 'a' && arr[j] <= 'z');
            if (alphaI && alphaJ) {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            } else if (!alphaI) {
                i++;
            } else {
                j--;
            }
        }
        return new String(arr);
    }
}
