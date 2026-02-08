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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp =head;
        int l=0;
        int count =0;
        while(temp !=null){
            l++;
            temp=temp.next;
        }
        int mid= l/2;
        temp=head;
        while(temp != null && count<mid-1){
            count++;
            temp=temp.next;
        }
        temp.next= temp.next.next;
        return head;
    }
}