class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int result=0;
        int sum=0;
        int start=0;
        HashSet<Integer> seen=new HashSet<>();
        for(int end=0;end<nums.length;end++){
            while(seen.contains(nums[end])){
                seen.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            sum += nums[end];
            seen.add(nums[end]);
            result=Math.max(result,sum);
        }
        return result;
    }
}