class Solution {
    public int characterReplacement(String s, int k) {
        int [] hash= new int[26];
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<s.length();r++){
            hash[s.charAt(r)-'A']++;

            maxfreq=Math.max(maxfreq, hash[s.charAt(r)-'A']);

            if(r-l+1-maxfreq >k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}