public class Solution {
    public boolean isStrobogrammatic(String num) {
        for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
            if (!isStrobogrammatic(num.charAt(i), num.charAt(j))) return false;
        }
        return true; 
    }

    private boolean isStrobogrammatic(char c1, char c2) {
        switch (c1 + "" + c2) {
            case "00" :
            case "11" :
            case "88" :
            case "69" :
            case "96" : return true;
            default : return false;
        }
    }
}
