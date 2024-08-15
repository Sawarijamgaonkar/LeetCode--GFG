class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target & i<n){
                return i;
            }
        }
        for(int i=0;i<n-1;i++){
            if((nums[i]<target & target<nums[i+1]) & i<n){
                return i+1;
            }
        }
        if(target>nums[n-1]){
            return n;
        }
        return 0;
    }
}