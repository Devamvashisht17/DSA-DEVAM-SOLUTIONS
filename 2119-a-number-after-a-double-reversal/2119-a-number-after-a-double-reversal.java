class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == reverse(reverse(num));
    }

    public int reverse(int n){
        int rev=0;
        while(n>0){
            int digit= n%10;
            rev= rev*10 + digit;
            n=n/10;
        }
        return rev;
    }
}