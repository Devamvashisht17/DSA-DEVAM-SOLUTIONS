class Solution {
    public boolean validDigit(int n, int x) {
        String str= String.valueOf(n);
        char ch= (char)(x+ '0');
        if(str.charAt(0)==ch){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}