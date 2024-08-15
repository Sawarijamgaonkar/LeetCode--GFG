class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList= new ArrayList<>();
        // int n=nums.length;
        Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=i+2;k<n;k++){
        //             if (nums[i]+nums[j]+nums[k]==0 & i!=j & j!=k & i!=k){
        //                 resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //             }
        //         }
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k &&nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                
            }
        }
        return resultList;
    }
}