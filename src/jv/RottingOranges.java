package jv;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    private int time = 0;

    public int orangesRotting(int[][] grid) {
        int y = grid.length;
        int x = grid[0].length;
        Queue<int[]> rotten = new LinkedList<>();

        int freshOranges = 0;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j] == 2) {
                    rotten.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) {
            return 0;
        }

        while (!rotten.isEmpty()) {
            int size = rotten.size();

            for (int i = 0; i < size; i++) {
                int[] temp = rotten.poll();
                assert temp != null;
                int row = temp[0];
                int col = temp[1];

                if (row > 0 && grid[row - 1][col] == 1) {
                    rotten.offer(new int[]{row - 1, col});
                    grid[row - 1][col] = 2;
                    freshOranges--;
                }
                if (row < y - 1 && grid[row + 1][col] == 1) {
                    rotten.offer(new int[]{row + 1, col});
                    grid[row + 1][col] = 2;
                    freshOranges--;
                }
                if (col > 0 && grid[row][col - 1] == 1) {
                    rotten.offer(new int[]{row, col - 1});
                    grid[row][col - 1] = 2;
                    freshOranges--;
                }
                if (col < x - 1 && grid[row][col + 1] == 1) {
                    rotten.offer(new int[]{row, col + 1});
                    grid[row][col + 1] = 2;
                    freshOranges--;
                }
            }

            time++;
        }
        return freshOranges == 0 ? time - 1 : -1;
    }
}
