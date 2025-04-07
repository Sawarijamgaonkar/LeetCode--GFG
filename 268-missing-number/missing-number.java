class Solution {
    public int missingNumber(int[] nums) {
        // 5ms solution:
        // Arrays.sort(nums);
        // if(nums[0]!=0){
        //     return 0;
        // }
        // for(int i=0;i<nums.length-1;i++){
            
        //     if(nums[i]!=nums[i+1]-1){
        //         return nums[i+1]-1;
        //     }
        // }
        // return nums[nums.length-1]+1;

        int total=nums.length;
        for(int i=0;i<nums.length;i++){
            total+=i-nums[i];
        }
        return total;
    }
}