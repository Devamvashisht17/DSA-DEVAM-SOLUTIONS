class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
        boolean sign= true;
        if((dividend >=0 && divisor <0) || (dividend <0 && divisor>0)){
            sign=false;
        }
        long n= Math.abs((long)dividend);
        long d= Math.abs((long)divisor);
        long quotient=0;

        while(n>=d){
            int cnt=0;

            while(n >= (d << (cnt+1))){
                cnt++;
            }
            quotient = quotient+ (1L << cnt);
            n = n- (d<<cnt);
        }
        if(!sign){
            quotient= -quotient;
        }
        return (int) quotient;
    }
}