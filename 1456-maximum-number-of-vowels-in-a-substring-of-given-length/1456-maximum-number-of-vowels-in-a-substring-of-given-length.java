class Solution {
    public boolean vowel(char ch){
        if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                count++;
            }
            if(i-left+1 > k){
                if(vowel(s.charAt(left))){
                    count--;
                }
                left++;
            }
            if(i-left+1==k){
               max= Math.max(max, count);
            }
        }
        return max;
    }
}