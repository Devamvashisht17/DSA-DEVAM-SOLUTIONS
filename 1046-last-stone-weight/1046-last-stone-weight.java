class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        for(int s:stones){
            list.add(s);

        }
        while(list.size() >1){
            Collections.sort(list);

            int n=list.size();

            int a=list.get(n-1);
            int b= list.get(n-2);

            list.remove(n-1);
            list.remove(n-2);

            if(a!=b){
                list.add(a-b);
            }
        }
        if(list.size()==0){
            return 0;
        }
        else{
            return list.get(0);
        }
    }
}