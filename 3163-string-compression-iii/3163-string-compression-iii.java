class Solution {
    public String compressedString(String word) {
        StringBuilder str= new StringBuilder();

        int i=0;
        // int count=0;

        while(i<word.length()){
            int count=0;
            char ch= word.charAt(i);
            
            while(i<word.length() && word.charAt(i) == ch && count<9){
                count++;
                i++;
            }
            str.append(count);
            str.append(ch);
        }
        return str.toString();
    }
}