class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set= new HashSet<>();
        int [] arr= new int[friends.length];
        int k=0;

        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                arr[k++]=order[i];
            }
        }
        return arr;
    }
}