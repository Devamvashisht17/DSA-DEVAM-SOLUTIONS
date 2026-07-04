class Solution {
    public boolean isPalindrome(String s,int i,int j)
    {
    while(i <j){
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);
        if(ch1 !=ch2){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
    public String longestPalindrome(String s) {
        int max=0,start=0,end=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1> max){
                        max= j-i+1;
                        start =i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}