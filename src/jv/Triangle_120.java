package jv;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        if (length == 0) {
            return 0;
        }
        int[] temp = new int[length];

        int index = 0;
        for (int num : triangle.get(length-1)) {
            temp[index++] = num;
        }

        for (int i = length - 2; i > -1; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                temp[j] = row.get(j) + Math.min(temp[j], temp[j+1]);
            }
        }

        return temp[0];
    }
}
