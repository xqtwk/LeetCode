package jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggest = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            biggest = Math.max(candy, biggest);
        }
        for (int candy : candies) {
            int sum = candy + extraCandies;
            if (sum >= biggest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
