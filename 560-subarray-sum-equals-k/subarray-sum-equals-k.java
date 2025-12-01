class Solution {
    public int subarraySum(int[] nums, int k) {
         int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int currSum = 0;

            // subarray from i to each j -> arr[i....j]
            for (int j = i; j < n; j++) {
                currSum += nums[j];

                // increment count if the currSum equals k
                if (currSum == k) {
                    count++;
                }
            }
           
        } return count;

    }  
}