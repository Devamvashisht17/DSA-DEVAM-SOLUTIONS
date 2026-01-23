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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr= new ArrayList<>();
        ListNode temp= head;
        while(temp != null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for(int i=0;i<arr.size();i++){
            tail.next = new ListNode(arr.get(i));
            tail=tail.next;
        }
        return dummy.next;
    }
}