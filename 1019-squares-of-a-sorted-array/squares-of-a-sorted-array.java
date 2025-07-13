class Solution {
    public int[] sortedSquares(int[] nums) {
        // Arrays.sort(nums) it will sort the input but we dont want that so not sorting the array here 
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]*nums[i];
        }Arrays.sort(result);
        return result;
    }
}