class Solution {
    public int islandPerimeter(int[][] grid) {
        // By default, each cell checks its perimeter on S/E
        // First-row cell checks its perimeter on N/S/E
        // First-column chell checks its perimeter on W/S/E
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (grid[i][j] == 1) {
                    // West (W): increment for first column
                    if (j == 0) {
                        perimeter++;
                    }
                    // North (N): increment for first row
                    if (i == 0) {
                        perimeter++;
                    }
                    // East (E): increment if last column / water
                    if (j + 1 == grid[i].length || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                    // South (S): increment if last row / water
                    if (i + 1 == grid.length || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                } else {
                    // West (W): skip
                    // North (N): skip
                    // East (E): increment for land
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        perimeter++;
                    }
                    // South (S): increment for land
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
