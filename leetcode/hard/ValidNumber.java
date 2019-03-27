class Solution {
    public boolean isNumber(String s) {
        // $full:  spaces[*]; sign[0-1]; ( digits[1+]; dec-point[1]; ); digits[1+]; ( $dec ); ( $sci ); spaces[*];
        // $dec:   decimal-point[1]; decimal-part[1+];
        // $sci:   sciNotation[1]; sign[0-1]; whole-number[1+];

        char[] arr = s.toCharArray();
        int i = 0;
        int len = s.length();

        // Step 1: check leading spaces
        while (i < len && arr[i] == ' ') i++;
        if (i == len) return false; // only space

        // Step 2: check sign
        if (arr[i] == '-' || arr[i] == '+') i++;
        if (i == len) return false; // sign must be followed by whole-number-part

        // Step 3: check decimal
        int digits = 0;
        int points = 0;
        while (i < len && (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.')) {
            if (arr[i] == '.') {
                points++;
            } else {
                digits++;
            }
            i++;
        }
        if (digits < 1 || points > 1) return false;
        if (i == len) return true;

        // Step 5: check scientific part
        if (arr[i] == 'e') {
            i++;
            if (i == len) return false;
            // sign
            if (arr[i] == '-' || arr[i] == '+') i++;
            if (i == len) return false;
            // scientific part
            if (arr[i] < '0' || arr[i] > '9') return false;
            while (i < len && arr[i] >= '0' && arr[i] <= '9') i++;
        }
        if (i == len) return true;

        // Step 6
        while (i < len && arr[i] == ' ') i++;
        return i == len;
    }
}
