public class No_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyhead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode node1 = dummyhead1;
        ListNode node2 = dummyHead2;
        while (head != null) {
            if (head.val < x) {
                node1.next = head;
                head = head.next;
                node1 = node1.next;
            } else {
                node2.next = head;
                head = head.next;
                node2 = node2.next;
            }
        }
        node2.next = null;
        node1.next = dummyHead2.next;
        return dummyhead1.next;
    }
}
