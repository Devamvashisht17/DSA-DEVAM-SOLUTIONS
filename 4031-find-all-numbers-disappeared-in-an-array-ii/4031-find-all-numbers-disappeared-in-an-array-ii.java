class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=lower;i<=upper;i++){
            if(set.contains(i)){
                continue;
            }
            int start=i;

            while(i<=upper && !set.contains(i)){
                i++;
            }
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(start);
            arr.add(i-1);
            list.add(arr);
        }
        return list; 
    }
}