class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder s= new StringBuilder();
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                s.append(rem);
            }
            n=n/10;

        }
        if(s.length()==0){
            return 0;
        }
        s= s.reverse();
        long num= Long.parseLong(s.toString());
        long x=num;
        long sum=0;
        while(num!=0){
            long rem=num%10;
            sum=sum+rem;
            num=num/10;   
        }
        return (long)x*sum;

    }
}