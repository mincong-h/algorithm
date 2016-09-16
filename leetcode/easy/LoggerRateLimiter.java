public class Logger {

    /**
     * Printed messages in the last seconds
     */
    private Map<String, Integer> lastPrintedMsg;

    /** Initialize your data structure here. */
    public Logger() {
        lastPrintedMsg = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (message == null) {
            return false;
        } else if (!lastPrintedMsg.containsKey(message)) {
            lastPrintedMsg.put(message, timestamp);
            return true;
        } else if (timestamp - lastPrintedMsg.get(message) >= 10) {
            lastPrintedMsg.put(message, timestamp);
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
