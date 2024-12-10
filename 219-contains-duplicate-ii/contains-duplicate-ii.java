class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int index=map.get(nums[i]);  
                //returns value at which nums[i] is present i.e. returns index which with it was saved.
                if(Math.abs(index-i)<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}