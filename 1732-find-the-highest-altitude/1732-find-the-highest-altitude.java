class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int num: gain){
            sum+=num;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}