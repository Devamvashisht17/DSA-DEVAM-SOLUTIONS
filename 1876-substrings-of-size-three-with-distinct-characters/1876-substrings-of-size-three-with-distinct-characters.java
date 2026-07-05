class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> set= new HashSet<>();
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));
            if(set.size()==3){
                count++;

            }
        }
        return count;
    }
}