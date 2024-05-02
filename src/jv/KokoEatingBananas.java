package jv;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().orElse(0);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            for (int p : piles) {
                int temp = p / mid;
                count += temp;
                if (p % mid != 0) {
                    count++;
                }
            }


            if (count <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public int minEatingSpeedPASSES(int[] piles, int h) {
        // Initial boundary for the binary search
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); // Max speed required to eat the largest pile in one hour

        while (left < right) { // Use < instead of <= for this binary search logic
            int mid = (left + right) / 2; // Calculate the middle value as possible speed
            if (canEatAll(piles, mid, h)) { // Check if it's possible to eat all piles with this speed within h hours
                right = mid; // Adjust right boundary if it's possible, to find the minimum speed
            } else {
                left = mid + 1; // Increase the speed if not possible
            }
        }

        return left; // Return the smallest possible maximum eating speed
    }

    private boolean canEatAll(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / speed + 1; // Calculate the hours needed for each pile
            if (time > h) return false; // If total time exceeds h, it's not possible with this speed
        }
        return true; // All piles can be eaten within h hours at this speed
    }
}
