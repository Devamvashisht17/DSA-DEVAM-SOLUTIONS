class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int original=n;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            sum= sum+rem;
            prod=prod*rem;
            n=n/10;
        }
        return (original %(sum+prod)==0);
    }
}