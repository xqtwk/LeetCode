package jv;

public class Matrix01_542 {
    private int size = 0;

    public void dfs(int[][] grid, int y, int x) {
        if (grid[y][x] == 1) {
            grid[y][x] = 0;
            size += 1;
            if (y >= 1) {
                dfs(grid, y - 1, x);
            }
            if (x >= 1) {
                dfs(grid, y, x - 1);
            }
            if (x + 1 < grid[0].length) {
                dfs(grid, y, x + 1);
            }
            if (y + 1 < grid.length) {
                dfs(grid, y + 1, x);
            }
        }
    }
}
