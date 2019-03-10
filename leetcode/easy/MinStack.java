class MinStack {

    /**
     * Stack for storing the minimum element at each level.
     *
     * <pre>
     * Level | Value | Min
     * ----- | ----- | ---
     *     3 |    -3 |  -3
     *     2 |     0 |  -2
     *     1 |    -2 |  -2
     * </pre>
     */
    private final Stack<Integer> minStack;
    private final Stack<Integer> stack;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (min > x) {
            min = x;
        }
        stack.push(x);
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        if (minStack.empty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = minStack.peek();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
