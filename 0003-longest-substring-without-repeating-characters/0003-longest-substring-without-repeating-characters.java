class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
        int[] hash= new int[256];
        for(int i=0;i<s.length();i++){
            while(hash[s.charAt(i)]==1){
                hash[s.charAt(left)]=0;
                left++;
            }
            hash[s.charAt(i)]=1;
            int len= i-left+1;
            maxlen= Math.max(len, maxlen);
        }
        return maxlen;

    }
}