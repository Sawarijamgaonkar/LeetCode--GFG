class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return subset_sum(nums, sum/2);
        }
        
    }
    public boolean subset_sum(int[] arr,int target){
        Boolean dp[][]=new Boolean[arr.length+1][target+1];
        if(target==0||arr.length==0){
            return true;
        }
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=target;j++){
                if(i==0){
                  dp[i][j]=false; 
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j- arr[i-1]] || dp[i-1][j];
                    // dp[i][j] = dp[i-1][j- arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        } 
        return dp[arr.length][target];
    }
}