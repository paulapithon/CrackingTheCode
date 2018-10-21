import java.util.HashSet;

public class RemoveDups {
    public static ListNode run(ListNode node) {
        HashSet<Integer> buffer = new HashSet<Integer>();
        ListNode head = node;
        while (node != null) {
            buffer.add(node.val);
            if (node.next != null && buffer.contains(node.next.val)) {
                if (node.next.next != null) {
                    node.next = node.next.next;   
                } else {
                    node.next = null;
                }
            } else {
                node = node.next;
            }
        }
        return head;
    }
}