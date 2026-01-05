class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList <Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
         }
         Collections.sort(arr);
         ListNode dummy=new ListNode(-1);
         ListNode tail=dummy;
         for(int i=0;i<arr.size();i++){
            ListNode newNode=new ListNode(arr.get(i));
            tail.next=newNode;
            tail=tail.next;
         }
         return dummy.next;
    }
}