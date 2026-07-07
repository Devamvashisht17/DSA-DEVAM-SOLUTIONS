class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0, rsum=0, maxSum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+ cardPoints[i];
        }
         maxSum=lsum;
        int rindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+ cardPoints[rindex];
            rindex= rindex-1;

            maxSum=Math.max(maxSum, lsum+rsum);
        }
        return maxSum;

    }
}