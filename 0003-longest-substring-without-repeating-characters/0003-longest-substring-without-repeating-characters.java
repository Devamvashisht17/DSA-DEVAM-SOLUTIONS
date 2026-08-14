class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
        int []hash= new int[256];

        for(int right=0;right<s.length();right++){
            while(hash[s.charAt(right)]==1){
                hash[s.charAt(left)]=0;
                left++;
            }
    	    hash[s.charAt(right)]=1;
            int len=right-left+1;
            maxlen=Math.max(maxlen, len);
        }
        return maxlen;
    }
}