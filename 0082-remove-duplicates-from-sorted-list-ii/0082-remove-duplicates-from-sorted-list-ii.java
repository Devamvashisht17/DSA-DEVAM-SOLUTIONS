class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;   // last node before duplicates
        ListNode curr = head;

        while (curr != null) {

            // Check if current node has duplicates
            if (curr.next != null && curr.val == curr.next.val) {

                // Skip all nodes with same value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Remove all duplicates
                prev.next = curr.next;
            } 
            else {
                // No duplicate → move prev
                prev = prev.next;
            }

            // Move current pointer
            curr = curr.next;
        }

        return dummy.next;
    }
}
