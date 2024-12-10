class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //I  got Runtime: 18 ms, faster than 83.04% of Java online submissions for Contains Duplicate II. So I am trying it below again.
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         int index=map.get(nums[i]);  
        //         //returns value at which nums[i] is present i.e. returns index which with it was saved.
        //         if(Math.abs(index-i)<=k){
        //             return true;
        //         }
        //         else{
        //             map.put(nums[i],i);
        //         }
        //     }
        //     else{
        //         map.put(nums[i],i);
        //     }
        // }
        // return false;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}