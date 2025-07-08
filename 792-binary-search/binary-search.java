class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(target<nums[mid]){
            end--;
          }
          else if(target>nums[mid]){
            start++;
          }
          else{
            return mid;
          }
        }
        return -1;
    }
}