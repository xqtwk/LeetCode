package jv;

import java.util.ArrayList;
import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        ArrayList<Integer> list = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < satisfaction.length; i++) {
            list.add(satisfaction[i]);
            if (satisfaction[i] > 0) {
                check = true;
            }
        }
        if (!check) {
            return 0;
        }
        int result = checkSum(list);
        for (int i = 0; i < list.size(); i++) {
            list.remove(0);
            int sum = checkSum(list);
            if (sum > result) {
                result = sum;
            } else {
                return result;
            }

        }
        return result;
    }

    public int checkSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i) * (i + 1);
        }
        return sum;
    }
}