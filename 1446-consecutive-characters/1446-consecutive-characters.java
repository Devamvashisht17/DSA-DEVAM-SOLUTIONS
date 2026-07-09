class Solution {
    public int maxPower(String s) {
        int left=0, maxlen=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()>1){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
            if(map.get(s.charAt(left))==0){
                map.remove(s.charAt(left));
            }
            left++;
            }
            if(map.size()<=1){
                maxlen=Math.max(maxlen, i-left+1);
            }
        }
        return maxlen;
    }
}