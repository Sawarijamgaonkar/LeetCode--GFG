class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        recurssion(result,new ArrayList<>(),nums);
        return result;
    }
    public void recurssion(List<List<Integer>> list, List<Integer> sublist, int[] nums){
        if(sublist.size()==nums.length){
            list.add(new ArrayList<>(sublist));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(sublist.contains(nums[i])){
                    continue;
                }
                sublist.add(nums[i]);
                recurssion(list,sublist,nums);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}