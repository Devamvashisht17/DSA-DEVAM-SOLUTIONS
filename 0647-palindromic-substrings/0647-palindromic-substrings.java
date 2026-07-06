class Solution {
    public boolean palindrome(String str){
        int n= str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palindrome(s.substring(i, j+1))){
                    count++;
                }
            }
        }
        return count;
    }
}