package jv;

import java.util.Arrays;

public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int middle = length / 2;
        int count = 0;
        temp = head;
        ListNode prev = null;

        while (count < middle) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        if (prev == null) {
            head = head.next;
        } else {
            prev.next = temp.next;
        }
        return head;
    }
}
