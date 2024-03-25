package jv;

import java.util.*;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        EqualRowAndColumnPairs equalRowAndColumnPairs = new EqualRowAndColumnPairs();
        equalRowAndColumnPairs.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}});
    }

    public int equalPairs(int[][] grid) {
        Map<String, Integer> rows = new HashMap<>();
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int count = 0;

        for (int[] ints : grid) {
            String rowString = Arrays.toString(ints);
            rows.put(rowString, rows.getOrDefault(rowString, 0) + 1);
        }

        for (int j = 0; j < colLength; j++) {
            int[] col = new int[rowLength];
            for (int i = 0; i < rowLength; i++) {
                col[i] = grid[i][j];
            }
            String colString = Arrays.toString(col);
            count += rows.getOrDefault(colString, 0);
        }

        return count;
    }

}
