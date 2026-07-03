class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans=-1;
        int maxfreq=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int freq=map.getOrDefault(nums[i], 0)+1;
                map.put(nums[i], freq);
            
            if(freq > maxfreq || (maxfreq==freq && nums[i]<ans)){
                maxfreq= freq;
                ans= nums[i];
            }
            }
        }
        return ans;
    }
}