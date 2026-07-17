class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int l=0;
        int min= Integer.MAX_VALUE;
        for(int right=0;right<blocks.length();right++){
            if(blocks.charAt(right)=='W'){
                count++;
            }
            if(right-l+1>k){
                if(blocks.charAt(l)=='W'){
                    count--;
                }
                l++;
            }
            if(right-l+1==k){
                min= Math.min(min, count);
            }
        }
        return min;
    }
}