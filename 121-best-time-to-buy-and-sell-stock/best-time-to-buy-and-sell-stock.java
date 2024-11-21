class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i:prices){
          minprofit=Math.min(minprofit,i);
          maxprofit=Math.max(maxprofit,i-minprofit);
        }return maxprofit;
    }
}