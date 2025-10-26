class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        // int prod=1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;i++){
        //         if(i==j){
        //             continue;
        //         }
        //         prod*=nums[j];
        //     }
        //     ans[i]=prod;
        Arrays.fill(ans,1);
        int pre=1;
        int post=1;
        
        for(int i=0;i<nums.length;i++){
           ans[i]=pre;
           pre=nums[i]*pre;

        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*post;
            post=post*nums[i];
        }
        return ans;
    }
}