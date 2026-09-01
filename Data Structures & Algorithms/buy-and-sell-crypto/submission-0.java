class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int max=0;
        for(int i:prices){
            max=Math.max(max,i-minPrice);
            minPrice=Math.min(minPrice,i);
        }
        return max;
    }
}
