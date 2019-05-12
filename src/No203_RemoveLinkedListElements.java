public class No203_RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val)
    {
        ListNode dumphead = new ListNode(-1);
        dumphead.next = head;
        ListNode p = dumphead;
        while (p.next != null)
        {
            if(p.next.val == val)
            {
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return dumphead.next;
    }

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        int[] init = {2,6,3,4,5,6};
        ListNode p = head;
        for(int i=0;i<6;i++)
        {
            p.next = new ListNode(init[i]);
            p = p.next;
        }
        removeElements(head,6);
        while (head.next!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }
}
