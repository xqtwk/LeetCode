package jv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {

    }
}

class RecentCounter {
    private final Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {

        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        requests.offer(t);
        return requests.size();
    }
}