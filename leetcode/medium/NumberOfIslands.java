public class Solution {

    public final char WATER = '0';
    public final char LAND = '1';

    public int numIslands(char[][] grid) {
        char islandID = 'a' - 1;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == LAND) {
                    define(grid, x, y, ++islandID);
                }
            }
        }
        return (int)(islandID - 'a' + 1);
    }

    private void define(char[][] grid, int x, int y, char islandID) {
        if (x < 0 ||
            y < 0 ||
            x >= grid.length ||
            y >= grid[0].length ||
            grid[x][y] != LAND) {
            return;
        }
        grid[x][y] = islandID;
        define(grid, x - 1, y, islandID);
        define(grid, x + 1, y, islandID);
        define(grid, x, y - 1, islandID);
        define(grid, x, y + 1, islandID);
    }
}
