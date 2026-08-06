class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int prod=1;
            int num=n;
            while(num!=0){
                int digit= num%10;
                prod=prod*digit;
                num=num/10;
            }
            num=n;
            if(prod%t==0){
                return num;
            }
            else{
                n++;
            }
        }
    }
}