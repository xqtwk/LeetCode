package jv;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers x = new AddTwoNumbers();
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        System.out.println(x.addTwoNumbers(n1, n2));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        ListNode main = new ListNode();
        ListNode temp = main;
        int number = 0;

        while (l1 != null || l2 != null) {
            int a = 0, b = 0;
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            int count = a + b + number;
            number = count / 10;
            temp.next = new ListNode(count % 10);
            temp = temp.next;
        }
        if(number != 0) temp.next = new ListNode(number);
        return main.next;
    }
}
