/**
 * @author zeller2
 * @author YJL1228
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Pick up the tallest guy first
        // When insert the next tall guy, just need to insert him into kth position
        // Repeat until all people are inserted into list
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[0] != p2[0] ? p2[0] - p1[0] : p1[1] - p2[1];
            }
        });
        List<int[]> res = new ArrayList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        return res.toArray(new int[people.length][]);
    }
}
