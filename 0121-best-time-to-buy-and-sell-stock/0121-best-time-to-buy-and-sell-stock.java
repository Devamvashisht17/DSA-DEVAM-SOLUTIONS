class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int price: prices){
            if(price<minprice){
                minprice= price;
            }
            else{
                maxprofit= Math.max(maxprofit, price-minprice);
            }
        }
        return maxprofit;
    }
}