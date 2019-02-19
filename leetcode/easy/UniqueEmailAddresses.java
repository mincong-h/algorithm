class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            int plus = email.indexOf('+');
            int at = email.indexOf('@');
            if (plus >= 0) {
                String localName = email.substring(0, plus).replace(".", "");
                String hostUrl = email.substring(at);
                emailSet.add(localName + hostUrl);
            } else {
                String localName = email.substring(0, at).replace(".", "");
                String hostUrl = email.substring(at);
                emailSet.add(localName + hostUrl);
            }
        }
        return emailSet.size();
    }
}
