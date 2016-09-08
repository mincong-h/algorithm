public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> currRow = new ArrayList<>(1);
        List<Integer> prevRow = null;

        if (numRows == 0) {
            return result;
        }

        currRow.add(1);
        result.add(currRow);
        prevRow = currRow;

        for (int numRow = 2; numRow <= numRows; numRow++) {
            // build current row
            currRow = new ArrayList<>(numRow);
            currRow.add(1);
            for (int i = 1; i < numRow - 1; i++) {
                currRow.add(prevRow.get(i - 1) + prevRow.get(i));
            }
            currRow.add(1);

            // insert to result, then prepare for next row
            result.add(currRow);
            prevRow = currRow;
        }
        return result;
    }
}
