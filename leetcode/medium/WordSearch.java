/**
 * {@link https://leetcode.com/problems/word-search/}
 */
public class Solution {
  public boolean exist(char[][] board, String word) {

    if (board == null || board.length == 0 || board[0].length == 0) {
      return false;
    }
    int lenX = board.length;
    int lenY = board[0].length;
    char[] letters = word.toCharArray();

    // find each char
    int i = 0;
    for (int x = 0; x < lenX; x++) {
      for (int y = 0; y < lenY; y++) {
        if (find(board, letters, i, x, y)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean find(char[][] board, char[] letters, int i, int x, int y) {

    if (i == letters.length) return true;

    if (x >= 0 && x < board.length
        && y >= 0 && y < board[0].length
        && board[x][y] == letters[i]) {

      // invalid the char
      board[x][y] ^= 256;

      boolean isFound = find(board, letters, i + 1, x, y - 1)
          || find(board, letters, i + 1, x, y + 1)
          || find(board, letters, i + 1, x - 1, y)
          || find(board, letters, i + 1, x + 1, y);

      // revalid the char
      board[x][y] ^= 256;
      return isFound;
    }
    return false;
  }
}

