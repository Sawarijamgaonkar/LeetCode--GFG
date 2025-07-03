class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i=0;
        nums[k]=nums[i];
        k++;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
       }
       return k; 
    }
}