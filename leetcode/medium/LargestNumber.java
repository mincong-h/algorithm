public class Solution {
    public String largestNumber(int[] nums) {

        // cast to String[]
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // sort
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // reverse order
            }
        });

        // when input is [0,0,...,0]
        if(numStrs[0].charAt(0) == '0') {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : numStrs) {
            sb.append(String.valueOf(str));
        }
        return sb.toString();
    }
}
