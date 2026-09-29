class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n= source.length;
        int m= target.length;

        if(n != m){
            return false;
        }
        if(n==1){
            return source[0] == target[0];
        }

        long sum1= 0;
        long sum2=0;
        for(int i=0;i<n;i++){
            sum1+=source[i];
            sum2+=target[i];
        }
        return sum1==sum2;
    }
}