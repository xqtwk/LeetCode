package jv;

import java.util.Arrays;

public class Matrix01_542 {


    public int[][] updateMatrix(int[][] matrix) {
        int y = matrix.length;
        int x = matrix[0].length;
        int[][] distance = new int[y][x];
        for (int i = 0; i < y; i++) {
            Arrays.fill(distance[i], 10000);
        }
        for (int[] key : distance) {
            for (int k : key) {
                System.out.print(k + ", ");
            }
            System.out.println();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] == 0) {
                    distance[i][j] = 0;
                    continue;
                }

                if (i > 0) distance[i][j] = Math.min(distance[i][j], distance[i - 1][j] + 1);
                if (j > 0) distance[i][j] = Math.min(distance[i][j], distance[i][j - 1] + 1);
            }
        }

        for (int i = y - 1; i >= 0; i--) {
            for (int j = x - 1; j >= 0; j--) {
                if (i != y - 1) distance[i][j] = Math.min(distance[i][j], distance[i + 1][j] + 1);
                if (j != x - 1) distance[i][j] = Math.min(distance[i][j], distance[i][j + 1] + 1);
            }
        }

        return distance;
    }
}
