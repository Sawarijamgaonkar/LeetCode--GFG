class Solution {
    public int maxSubArray(int[] nums) {

        // my first solution: 1ms
        // int max=Integer.MIN_VALUE;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     max=Math.max(sum,max);
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return max;

        // kadane's algorithm:
        int curr_max=nums[0];
        int max_till_now=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_max=Math.max(nums[i],nums[i]+curr_max);
            max_till_now=Math.max(max_till_now,curr_max);
        }
        return max_till_now;
    }
}