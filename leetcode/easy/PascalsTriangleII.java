public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(rowIndex);

        if(rowIndex < 0) {
            return res;
        }

        for(int currRow = 0; currRow <= rowIndex; currRow++) {
            res.add(1);
            for(int prevRow = currRow - 1; prevRow > 0; prevRow--) {
                res.set(prevRow, res.get(prevRow - 1) + res.get(prevRow));
            }
        }
        return res;
    }
}
