class Solution {
    public int maximumLengthSubstring(String s) {
        int []hash= new int[26];
        int left=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)- 'a']++;

            while(hash[s.charAt(i)- 'a'] >2){
                hash[s.charAt(left)- 'a']--;
                left++;
            }
            max= Math.max(max, i-left+1);
        }
        return max;
    }
}