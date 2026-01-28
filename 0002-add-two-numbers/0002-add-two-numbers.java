class Solution {
    int carry = 0;   // class-level carry

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // base case
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = 0;
        int val2 = 0;

        if (l1 != null) {
            val1 = l1.val;
        }

        if (l2 != null) {
            val2 = l2.val;
        }

        int sum = val1 + val2 + carry;
        carry = sum / 10;

        ListNode ans = new ListNode(sum % 10);

        ListNode next1 = null;
        ListNode next2 = null;

        if (l1 != null) {
            next1 = l1.next;
        }

        if (l2 != null) {
            next2 = l2.next;
        }

        ans.next = addTwoNumbers(next1, next2);

        return ans;
    }
}