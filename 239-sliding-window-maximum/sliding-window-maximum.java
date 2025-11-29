class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int[] ans=new int[nums.length-k+1];
       Deque<Integer>q=new LinkedList<>();
       int i=0,j=0;
       while(j<nums.length){
        //if q is empty 
        if(q.size()==0){
            q.add(nums[j]);
        }else{
        //calculations
        while(q.size()>0&&q.peekLast()<nums[j]){
            q.removeLast();
        }
        //max element rn
        q.add(nums[j]);}
        if(j-i+1<k){
            j++;
        }//hit the window size
        else if(j-i+1==k){
            ans[i]=q.peek(); //ans will be always at the first 
            if(q.peek()==nums[i]){ //pehle wale cal remove 
                q.removeFirst(); //max element that we dont need in future
            }
            i++;j++;
        }
       }
       return ans;
    }
}