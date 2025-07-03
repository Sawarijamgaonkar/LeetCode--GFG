class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] result=new int[2];
        // int left=0;
        // int right=nums.length-1;
        // while(left<right){
        //     if(nums[left]==target){
        //         result[0]=left;
        //     }
        //     if(nums[right]==target){
        //         result[1]=right;
        //     }
        //     left++;
        //     right--;
        // }
        // return result;

        int[] result=new int[2];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
        }
        if(count==0){
            return new int[] {-1,-1};
        }
        result[0]=min;
        result[1]=max;
        return result;

    }
}