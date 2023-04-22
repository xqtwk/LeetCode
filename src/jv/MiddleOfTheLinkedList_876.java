package jv;

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int index = 0;

        while (head != null) {
            A[index++] = head;
            head = head.next;
        }

        return A[index / 2];
    }
}
