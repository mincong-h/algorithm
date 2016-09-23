public class Solution {
    /**
     * 123   1  23    1->3->9->7->1    741
     * 456 = 4 5 6 => 4->2->6->8->4 => 852
     * 789   78  9                     963
     */
    public void rotate(int[][] matrix) {
        final int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int A = matrix[i][j];
                int B = matrix[j][n - 1 - i];
                int C = matrix[n - 1 - i][n - 1 - j];
                int D = matrix[n - 1 - j][i];
                matrix[i][j] = D;
                matrix[j][n - 1 - i] = A;
                matrix[n - 1 - i][n - 1 - j] = B;
                matrix[n - 1 - j][i] = C;
            }
        }
    }
}
