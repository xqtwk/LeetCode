package jv;

public class RemoveNthNodeFromEndOfList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        count = count - n;

        if (count == 0) {
            temp = head.next;
            head.next = null;
            head = null;
            return temp;
        }

        ListNode left = head;
        ListNode right = null;

        while (count > 0) {
            right = left;
            left = left.next;
            count--;
        }

        right.next = left.next;
        left.next = null;

        return head;
    }
}
