class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                max=Math.max(max,nums[i]);
                continue;
            }
            if(set.contains(nums[i])){
                continue;
            }
            else{
                set.add(nums[i]);
                max=Math.max(max,nums[i]);
                sum+=nums[i];
            }
        }
        if(sum==0){
            return max;
        }
        return sum;
    }
}