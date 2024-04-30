package jv;

import java.util.*;

/* First try
public class SmallestInfiniteSet {

    private final Set<Integer> set = new HashSet<>();
    private final PriorityQueue<Integer> heap = new PriorityQueue<>();
    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; i++) {
            set.add(i);
        }
    }

    public int popSmallest() {
        Optional<Integer> x = set.stream().findFirst();
        x.ifPresent(set::remove);
        return x.orElse(-1);
    }


    public void addBack(int num) {
        set.add(num);
    }
}
*/

/*
public class SmallestInfiniteSet {
    private final Set<Integer> set;
    private final PriorityQueue<Integer> heap;
    public SmallestInfiniteSet() {
        heap = new PriorityQueue<>();
        set = new HashSet<>();

        for (int i = 1; i <= 1000; i++) {
            set.add(i);
            heap.offer(i);
        }
    }

    public int popSmallest() {
        set.remove(heap.peek());
        if (!heap.isEmpty()) {
            return heap.poll();
        }
        return -1;
    }


    public void addBack(int num) {
        if (set.add(num)) {
            heap.offer(num);
        }
    }
}

 */


class SmallestInfiniteSet {
    private final byte[] isPresent;
    private int minIndex;
    public SmallestInfiniteSet() {
        this.isPresent=new byte[1001];
        this.minIndex=0;
    }

    public int popSmallest() {
        while(true) {
            if (isPresent[minIndex++] != 1) break;
        }
        isPresent[minIndex-1]=1;
        return minIndex;
    }

    public void addBack(int num) {
        isPresent[num-1]=0;
        minIndex = Math.min(minIndex,num-1);
    }
}