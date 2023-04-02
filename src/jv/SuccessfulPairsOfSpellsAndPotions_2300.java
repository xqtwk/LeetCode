package jv;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions_2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s = spells.length;
        int p = potions.length;
        int[] result = new int[s];

        Arrays.sort(potions);

        for (int i = 0; i < s; i++) {
            int left = 0, right = p;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * (long) potions[mid] >= success) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = p - left;
        }

        return result;
    }
}
