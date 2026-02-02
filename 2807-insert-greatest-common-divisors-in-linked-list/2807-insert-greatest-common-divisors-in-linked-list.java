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
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr= head;
        while(curr != null && curr.next != null){
            ListNode new1 = new ListNode(gcd(curr.val, curr.next.val));
            new1.next = curr.next;
            curr.next =new1;

            curr= new1.next;
        }
        return head;
    }
}