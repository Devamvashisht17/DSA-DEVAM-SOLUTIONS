class Solution {
    public String longestPrefix(String s) {
        int n= s.length();
        int [] lhp= new int[n];

        int len=0;
        int i=1;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lhp[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len= lhp[len-1];
                }
                else{
                    lhp[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0, lhp[n-1]);
    }
}