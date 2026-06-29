class Solution {
    public int integerBreak(int n) {
        int res=1;
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        while(n>4){
            res= res*3;
            n=n-3;
        }
        return res*n;
    }
}