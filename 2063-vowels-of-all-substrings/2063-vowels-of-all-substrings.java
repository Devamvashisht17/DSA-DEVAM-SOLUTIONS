class Solution {
    public long countVowels(String word) {
        long count=0;
        int n=word.length();

        for(int i=0;i<n;i++){
            char ch= word.charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                count+=(long)(i+1)*(n-i);
            }
        }
        return count;
    }
}