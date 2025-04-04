class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int second_num=target-nums[i];
            if(map.containsKey(second_num)){
                return new int[]{map.get(second_num),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

// 46 ms:
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] == target - nums[i]) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }

    // 67ms:
    // public int[] twoSum(int[] nums, int target) {
    //     int[] sol=new int[2];
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(nums[i]+nums[j]==target&&i!=j){
    //                 sol[0]=i;
    //                 sol[1]=j;
    //             }
    //         }
    //     }
    //     return sol;
    // }
}