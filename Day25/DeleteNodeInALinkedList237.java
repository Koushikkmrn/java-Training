class ListNode {
    int val;
    ListNode next;
}

public class DeleteNodeInALinkedList237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
