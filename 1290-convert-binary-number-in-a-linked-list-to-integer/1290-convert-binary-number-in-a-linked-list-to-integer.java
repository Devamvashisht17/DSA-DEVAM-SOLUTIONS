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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        ArrayList <Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            temp= temp.next;
        }
        int sum=0;
        int power=1;
        for(int i=arr.size()-1;i>=0;i--){
            sum= sum+ arr.get(i) *power;
            power = power*2;
        }

        return sum;
    }
}