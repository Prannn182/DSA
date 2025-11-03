class Solution {
    public int minCost(String colors, int[] neededTime) {
        int max=neededTime[0];
        int total=0;
        for(int i=1;i<colors.length();i++){
            {
                if(colors.charAt(i)==colors.charAt(i-1)){
                   total+=Math.min(max,neededTime[i]);
                   max=Math.max(max,neededTime[i]);
                }else{
                    max=neededTime[i];
                }
            }
        }return total;
    }
}