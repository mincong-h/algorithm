/**
 * Written on whiteboard. 90 mins, 3 submissions.
 * {@link https://leetcode.com/problems/meeting-rooms-ii/}
 *
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {

    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        PriorityQueue<Room> rooms = new PriorityQueue<>();
        for (Interval interval : intervals) {
            if (!rooms.isEmpty() && interval.start >= rooms.peek().availableFrom) {
                Room r = rooms.poll();
                r.add(interval);
                rooms.add(r);
            } else {
                rooms.add(new Room(interval));
            }
        }
        return rooms.size();
    }

    private class Room implements Comparable<Room> {

        List<Interval> meetings;
        int availableFrom;

        Room(Interval interval) {
            meetings = new LinkedList<>();
            add(interval);
        }

        public void add(Interval interval) {
            meetings.add(interval);
            availableFrom = interval.end;
        }

        public int compareTo(Room r) {
            return availableFrom - r.availableFrom;
        }
    }
}
