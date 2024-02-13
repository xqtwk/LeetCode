package jv;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        ListNode result = new ListNode();
        ListNode temp = result;

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            temp.next = minNode;
            temp = temp.next;

            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return result.next;
    }
}
