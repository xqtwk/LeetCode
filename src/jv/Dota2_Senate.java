package jv;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dota2_Senate {
    public static void main(String[] args) {

    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> dire = new LinkedList<>();
        Queue<Integer> radiant = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') radiant.offer(i);
            else dire.offer(i);
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll();
            int direIndex = dire.poll();
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";

    }
}
