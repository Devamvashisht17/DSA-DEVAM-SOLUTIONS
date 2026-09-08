class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }

        ArrayList<Character> list= new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>() {
            public int compare(Character a, Character b){
                return map.get(b) - map.get(a);
            }
        });

        StringBuilder str= new StringBuilder();
        for(char ch: list){
            int freq= map.get(ch);

            for(int i=0;i<freq;i++){
                str.append(ch);
            }
        }
        return str.toString();

    }
}