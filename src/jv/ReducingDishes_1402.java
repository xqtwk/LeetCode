package jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReducingDishes_1402 {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        ArrayList<Integer> startList = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < satisfaction.length; i++) {
            startList.add(satisfaction[i]);
            if (satisfaction[i] > 0) {
                check = true;
            }
        }
        if (check == false) {
            return 0;
        }
        int result = checkSum(startList);
        ArrayList<Integer> temp = startList;
        for (int i = 0; i < startList.size(); i++) {
            temp.remove(0);
            int sum = checkSum(temp);
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
            sum+= list.get(i) * (i+1);
        }
        return sum;
    }
}
