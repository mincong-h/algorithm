public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else if (matrix[row][col] > target) col--;
        }
        return false;
    }
}
