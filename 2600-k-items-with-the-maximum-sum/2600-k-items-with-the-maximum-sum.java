class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int taken= Math.min(k, numOnes);
        sum=sum+taken;
        k=k-taken;

        taken= Math.min(k, numZeros);
        k=k-taken;

        taken= Math.min(k, numNegOnes);
        sum=sum-taken;
        return sum;
    }
}