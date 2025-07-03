class Solution {
    public void nextPermutation(int[] nums) {
        int right=nums.length-1;
        while(right>0 && nums[right-1]>=nums[right] ){
            right--;
        }
        if(right==0){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>=right && nums[j]<=nums[right-1]){
            j--;
        }
        swap(nums,right-1,j);
        reverse(nums,right,nums.length-1);
    }
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

}