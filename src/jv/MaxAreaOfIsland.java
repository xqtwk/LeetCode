package jv;


public class MaxAreaOfIsland {
    private int size = 0;
    public int maxAreaOfIsland(int[][] grid) {;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if( grid[i][j] == 1) {
                    dfs(grid,i,j);
                }
                if (size > result) {
                    result = size;
                }
                size = 0;
            }
        }
        return result;
    }

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
