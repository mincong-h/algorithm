/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return Collections.emptyList();
        }
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        int i = 0;
        for (Interval interval : intervals) {
            starts[i] = interval.start;
            ends[i] = interval.end;
            i++;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        i = 0;
        int start = starts[0];
        List<Interval> results = new LinkedList<>();
        while (i < n) {
            if (i + 1 == n || ends[i] < starts[i + 1]) {
                results.add(new Interval(start, ends[i]));
                if (i + 1 < n) {
                    start = starts[i + 1];
                }
            }
            i++;
        }
        return results;
    }
}
