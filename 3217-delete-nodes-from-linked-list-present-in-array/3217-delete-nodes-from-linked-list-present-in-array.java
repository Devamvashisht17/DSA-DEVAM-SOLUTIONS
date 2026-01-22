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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp= head;
        ListNode dummy  = new ListNode(-1);
        ListNode tail = dummy;

        int [] freq = new int[100001];
        while(temp != null){
            freq[temp.val] =1;
            temp= temp.next;
        }
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]=0;
        }
        temp=head;
        while(temp != null){
            if(freq[temp.val]==1){
                tail.next= new ListNode(temp.val);
                tail=tail.next;
            }
            temp= temp.next;
        }
        return dummy.next;
    }
}