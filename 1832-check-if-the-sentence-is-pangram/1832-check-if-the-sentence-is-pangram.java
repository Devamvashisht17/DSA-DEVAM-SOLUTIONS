class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> arr= new HashSet();

        for(int i=0;i<sentence.length();i++){
            char ch= sentence.charAt(i);

            if(ch>='a' && ch <='z'){
                arr.add(ch);

            }
        }
        return arr.size()==26;
    }
}