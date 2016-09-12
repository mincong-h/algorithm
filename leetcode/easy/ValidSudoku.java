public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer>[] rowMap = new HashMap[9];
        Map<Character, Integer>[] colMap = new HashMap[9];
        Map<Character, Integer>[] sqrMap = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rowMap[i] = new HashMap<>();
            colMap[i] = new HashMap<>();
            sqrMap[i] = new HashMap<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    // validate sudoku for cell (row, col)
                    if (rowMap[row].containsKey(c) ||
                        colMap[col].containsKey(c) ||
                        sqrMap[sqrIndex(row, col)].containsKey(c)) {
                        return false;
                    }
                    rowMap[row].put(c, 1);
                    colMap[col].put(c, 1);
                    sqrMap[sqrIndex(row, col)].put(c, 1);
                }
            }
        }
        return true;
    }

    private int sqrIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }
}
