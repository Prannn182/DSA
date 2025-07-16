class Solution {
    public int search(int[] nums, int target) {
       int pivot=findpivot(nums);
       if(pivot==-1){
        return binarysearch(nums,target,0,nums.length-1);
       }
       if(target==nums[pivot]){
        return pivot;
       }
       if(target>=nums[0]){
       return binarysearch(nums,target,0,pivot-1);
       }
      return binarysearch(nums,target,pivot+1,nums.length-1);
       } 
    
    int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
    int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
 int mid=start+(end-start)/2;
        // 4 cases
        if(mid<end && arr[mid]>arr[mid+1]){
            return mid+1;
        }
        if(mid > start && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[start]>=arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        } 
        }
return -1;
       
    }
}
