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
    public int[] nextLargerNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp= head;
        int count=0;
        ArrayList <Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            count++;
            temp=temp.next;
        }
        int [] a =new int[count];
        Stack<Integer> st = new Stack<>();
        for(int i=count-1;i>=0;i--){
            while(!st.empty() && st.peek()<= arr.get(i)){
                st.pop();
            }
            if(st.empty()){
                a[i] =0;
            }
            else{
                a[i] = st.peek();
            }
            st.push(arr.get(i));
        }
        return a;
        
        
    }
}