class Solution {
    public boolean same(int []a, int[]b){
        for(int i=0;i<26;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int [] freq1= new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)- 'a']++;

        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            int [] freq2= new int [26];
            for(int j=i;j<i+s1.length();j++){
                freq2[s2.charAt(j) - 'a']++;
            }
            if(same(freq1, freq2)){
                return true;
            }}

            return false;
        }
}