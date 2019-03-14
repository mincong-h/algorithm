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
        // sort intervals
        intervals.sort((i1, i2) -> i1.start - i2.start);

        // add to results, merge if needed
        LinkedList<Interval> results = new LinkedList<>();
        for (Interval i : intervals) {
            if (!results.isEmpty()) {
                Interval last = results.getLast();
                // overlap
                if (last.start <= i.start && i.start <= last.end) {
                    last.end = Math.max(i.end, last.end);
                    continue;
                }
            }
            results.add(i);
        }
        return results;
    }
}
