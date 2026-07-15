class Solution {
    public int gcd(int a, int b){
        while(b!=0){
        int temp= b;
        b=a%b;
        a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int evensum=0;
        int oddsum=0;

        for(int i=1;i<=n;i++){
            evensum=evensum+ (2*i);
            oddsum=oddsum + (2*i-1);

        }
        return gcd(evensum,oddsum);
    }
}