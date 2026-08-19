class Solution {
    public char findTheDifference(String s, String t) {
        int extra=0;
        
        for(int i=0;i<s.length();i++){
            extra = extra ^ s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            extra= extra ^ t.charAt(j);
        }
        return(char) extra;
    }
}