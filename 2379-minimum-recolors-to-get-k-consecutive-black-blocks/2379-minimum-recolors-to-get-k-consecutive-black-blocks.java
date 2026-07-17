class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int l=0;
        int min= Integer.MAX_VALUE;

        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
            if(i-l+1>k){
                if(blocks.charAt(l)=='W'){
                    count--;
                
                }
                l++;
            }
            if(i-l+1 == k){
                  min= Math.min(min, count);
            }
          
        }
        return min;
    }
}