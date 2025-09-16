class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
 if(nums[i]==nums[i-1]){
            count++;
        }else{
            count=1;
        }
        if(count>nums.length/2){
            return nums[i];
        }
        }
       
        return nums[0];
    }
}