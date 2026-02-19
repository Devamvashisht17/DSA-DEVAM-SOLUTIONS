/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
            ListNode slow= head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next != null){
                fast= fast.next.next;
                slow= slow.next;
            }
            ListNode prev= null;
            ListNode curr = slow.next;
            slow.next = null;
            ListNode next= null;

             
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev= curr;
                curr= next;
            }
            ListNode first = head;
            ListNode second =prev;

            while(second != null){
                ListNode temp= first.next;
                ListNode temp1= second.next;

                first.next= second;
                second.next=temp;
                
                first = temp;
                second= temp1;

            }
    }
}