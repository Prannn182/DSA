class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int element:nums){
            if(even(element)){
                count++;
            }
        } return count;
    }
    static boolean even(int element){
        int count=0;
        while(element>0){
            count++;
            element=element/10;
        }
        if(count%2==0){
            return true;
        }else{
            return false;
        }
    }
}