public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length())
                .append('/')
                .append(str);
        }
        return builder.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int slash = s.indexOf('/', i);
            int length = Integer.valueOf(s.substring(i, slash));
            strs.add(s.substring(slash + 1, slash + 1 + length));
            i = slash + 1 + length;
        }
        return strs;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
