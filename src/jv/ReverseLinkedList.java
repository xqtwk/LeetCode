package jv;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode main = head;
        ListNode newList = new ListNode();
        while (main != null){
            ListNode nodeNext = main.next;
            main.next = newList.next;
            newList.next = main;
            main = nodeNext;
        }

        return newList.next;
    }
}
