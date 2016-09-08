public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] box = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            box[index]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            box[index]--;
            if (box[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
