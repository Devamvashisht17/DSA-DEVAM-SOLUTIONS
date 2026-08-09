class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;

        int len_discounts=discounts.length;
        int len_prices=prices.length;

        for(int i=len_prices-1;i>=0;i--){
            if(len_discounts>0){
                sum=sum + prices[i] * (100 - discounts[len_discounts-1]) /100.0;
                len_discounts--;
            }
            else{
                sum=sum+prices[i];
            }
        }
        return sum;
    }
}