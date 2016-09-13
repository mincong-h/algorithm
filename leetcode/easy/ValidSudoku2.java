public class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Character>[] rowList = new ArrayList[9];
        List<Character>[] colList = new ArrayList[9];
        List<Character>[] sqrList = new ArrayList[9];

        for (int i = 0; i < 9; i++) {
            rowMap[i] = new ArrayList<>();
            colMap[i] = new ArrayList<>();
            sqrMap[i] = new ArrayList<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    // validate sudoku for cell (row, col)
                    if (rowList[row].contains(c) ||
                        colList[col].contains(c) ||
                        sqrList[sqrIndex(row, col)].contains(c)) {
                        return false;
                    }
                    rowMap[row].add(c);
                    colMap[col].add(c);
                    sqrMap[sqrIndex(row, col)].add(c);
                }
            }
        }
        return true;
    }

    private int sqrIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }
}
