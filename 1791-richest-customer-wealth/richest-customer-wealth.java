class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxwealth=0;
       
        for(int[] person:accounts){
             int sum=0;
        for(int account:person){
            sum+=account; //this will sum the account wealth
        }
         maxwealth=Math.max(maxwealth,sum);   //if(sum>maxwealth){sum=ans;}
        
    }    
 return maxwealth;}}
