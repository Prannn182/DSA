class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0]; // will start from day 1
        int prof=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            prof=Math.max(prof,prices[i]-min);
        }
        
        return prof;
    }
}