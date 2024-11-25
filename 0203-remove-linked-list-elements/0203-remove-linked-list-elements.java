class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node pointing to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node by skipping it
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        // Return the new head (skipping the dummy node)
        return dummy.next;
    }
}
