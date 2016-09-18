public class MovingAverage {

    private final int SIZE;
    private LinkedList<Integer> list;
    private double sum = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.list = new LinkedList<>();
        this.SIZE = size;
    }
    
    public double next(int val) {
        if (list.size() == SIZE) {
            sum -= list.removeFirst();
        }
        list.add(val);
        sum += val;
        return sum / list.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
