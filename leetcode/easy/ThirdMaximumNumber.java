/**
 * {@link https://leetcode.com/problems/third-maximum-number/}
 */
public class Solution {

    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> top3 = new PriorityQueue<>(1, new Comparator<Integer>(){
           public int compare(Integer a, Integer b) {
               return a.compareTo(b);
           } 
        });

        for (int num : nums) {
            if (!top3.contains(num)) {
                top3.add(num);
                if (top3.size() > 3) {
                    top3.poll();
                }
            }
        }

        if (top3.size() == 3) {
            return top3.peek();
        }

        while (top3.size() > 1) {
            top3.poll();
        }
        return top3.peek();
    }
}

