    //...
    /**
     * {@link https://www.hackerrank.com/challenges/java-anagrams}
     */
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        if (a == null || b == null) return false;

        int[] charBox = new int[26];
        for (char c : a.toCharArray()) {
            char lower = Character.toLowerCase(c);
            charBox[(int) lower - 'a']++;
        }
        for (char c : b.toCharArray()) {
            char lower = Character.toLowerCase(c);
            charBox[(int) lower - 'a']--;
        }

        // verify the result
        for (int i : charBox) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
