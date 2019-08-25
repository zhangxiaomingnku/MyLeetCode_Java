public class No_138 {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node node = head;
        while (node != null) {
            Node clone = new Node(node.val, node.next, null);
            Node tmp = node.next;
            node.next = clone;
            node = tmp;
        }

        node = head;
        while (node != null) {
            node.next.random = node.random == null ? null : node.random.next;
            node = node.next.next;
        }

        node = head;
        Node cloneHead = head.next;
        while (node.next != null) {
            Node tmp = node.next;
            node.next = node.next.next;
            node = tmp;
        }
        return cloneHead;
    }
}
