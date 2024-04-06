package jv;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {

    }

    public int pairSum(ListNode head) {
        int max = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode temp = slow;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        while (head != slow && prev != null) {
            max = Math.max(max, head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}
