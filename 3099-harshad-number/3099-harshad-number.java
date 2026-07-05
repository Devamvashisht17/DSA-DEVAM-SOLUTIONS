class Solution {
    public int sum(int num){
        int sum=0;
        while(num!=0){
            int digit= num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
        
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x%sum(x)==0){
            return sum(x);
        }
        return -1;
    }
}