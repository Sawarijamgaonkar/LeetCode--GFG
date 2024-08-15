class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]+nums[j]==target&&i!=j){
                    sol[0]=i;
                    sol[1]=j;
                }
            }
        }
        return sol;
    }
}