class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long mx=0;
        long sum=0;
        int i=0;
        HashSet<Integer> unique =new HashSet<>();
        for(int j=0;j<nums.length;j++){
            while(unique.contains(nums[j])){
                unique.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            unique.add(nums[j]);
            sum+=nums[j];
            if(j-i+1==k){
                mx=Math.max(mx,sum);
                unique.remove(nums[i]);
                sum-=nums[i];
                i++;
                
            }
           
        }
        return mx;
    }
}