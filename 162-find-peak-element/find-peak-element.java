class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //we are at the decreasing part of array
                end=mid;
            }else{
                // we are the the increasing part of array
                start=mid+1;
            } // the loop will will break if and only if when only one element iss remaining or you can say that start==end then the loop will break and we will get our answer
        } return start; // start==end so we can write anything 
    }
}