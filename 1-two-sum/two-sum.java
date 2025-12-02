class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){ //j=i+1 coz we will work on i+1 value
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        } return new int[] {};
    }
}