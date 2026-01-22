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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr= head;
        ListNode curr1= head;
        int count=1;
        ListNode temp= head;
        int n=0;
        while(temp != null){
            n++;
            temp= temp.next;
            
        }
        while(curr != null && count <k){
            curr= curr.next;
            count++;
        }
        int rem= n-k+1;
        count =1;
        while(curr1 != null && count < rem){
            curr1= curr1.next;
            count++;
        }
        
        int temp1= curr.val;
        curr.val = curr1.val;
        curr1.val = temp1;

        return head;
    }
}