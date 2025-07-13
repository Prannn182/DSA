class Solution {
    public int[] sortedSquares(int[] nums) {
        // Arrays.sort(nums) it will sort the input but we dont want that so not sorting the array here 
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }Arrays.sort(nums);
        return nums;
    }
}