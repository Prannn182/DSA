class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        for(int num:nums){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{ //arr[mid]==2
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}