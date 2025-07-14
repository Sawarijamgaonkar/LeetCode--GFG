class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        recurssion(result,new ArrayList<>(),nums,0);
        return result;
    }
    public void recurssion(List<List<Integer>> list, List<Integer> sublist, int[] nums, int start){
        list.add(new ArrayList<>(sublist));
        for(int i=start;i<nums.length;i++){
            sublist.add(nums[i]);
            recurssion(list,sublist,nums,i+1);
            sublist.remove(sublist.size()-1);
        }
    }
}