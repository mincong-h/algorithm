class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    private int size = 0;

    // Push element x onto stack.
    public void push(int x) {
        size++;
        queue.add(x);
        for (int i = 0; i < size - 1; i++) queue.add(queue.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
        if (size > 0) size--;
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return size == 0;
    }
}
