class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<=2){
            return -1;
        }
        int sum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int currsum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)>Math.abs(currsum-target)){
                    sum=currsum;
                }
                if(currsum>target){
                    k--;
                }
                else if(currsum==target){
                    return currsum;
                }
                else{
                    j++;
                }
            }
        }
        return sum;
    }
}