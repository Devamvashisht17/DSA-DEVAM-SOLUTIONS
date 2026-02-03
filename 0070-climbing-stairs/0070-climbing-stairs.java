class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a =1, b=2;
        int fibo;
        for(int i=3;i<=n;i++){
            fibo = a+b;
            a=b;
            b=fibo;
        }
        return b;
    }
}