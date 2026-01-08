class Solution {
    public int subarraySum(int[] nums, int k) {
  
//         int i=0,j=0;
//         long sum=0;
//         int max=0;
//         while(j<nums.length){
//             sum=sum+nums[j];
//             if(sum<k){
//                 j++;
//             }else if(sum==k){
//                 max=Math.max(max,j-i+1);
//                 j++;
//             }
//             else if(sum>k){
//                 while(sum>k&&i<=j){
//                 sum=sum-nums[i];
//                 i++;}
//                 if(sum==k){
//                     max=Math.max(max,j-i+1);
                  
//                 }
//                 j++;
//             }
//         } return max;
//    
         int count = 0;
        int n = nums.length;

       for(int i=0;i<n;i++){
        int currsum=0;
        for(int j=i;j<n;j++){
            currsum+=nums[j];
            if(currsum==k){
                count++;
            }
        }
       } return count;

    }  
}