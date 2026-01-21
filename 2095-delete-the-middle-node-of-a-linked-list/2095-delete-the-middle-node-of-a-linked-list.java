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
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int mid=length/2;
        int count=0;
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        temp=head;
        while(temp!=null){
            ListNode newNode=new ListNode(temp.val);
            if(count!=mid){
                tail.next=newNode;
                tail=newNode;
            }
            temp=temp.next;
            count++;
        }
        return dummy.next;
    }
}