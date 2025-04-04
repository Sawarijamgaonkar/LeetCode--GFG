class Solution {
    public int[] sortArray(int[] nums) {
        // selection sort:
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]>nums[i]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
}