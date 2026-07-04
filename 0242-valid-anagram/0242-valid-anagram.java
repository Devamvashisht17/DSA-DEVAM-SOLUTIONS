class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1 );
            }
        }
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }
        for(int x: map.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}