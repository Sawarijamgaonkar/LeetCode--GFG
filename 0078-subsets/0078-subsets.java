// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result=new ArrayList<>();
//         Arrays.sort(nums);
//         recurssion(result,new ArrayList<>(),nums,0);
//         return result;
//     }
//     public void recurssion(List<List<Integer>> list, List<Integer> sublist, int[] nums, int start){
//         list.add(new ArrayList<>(sublist));
//         for(int i=start;i<nums.length;i++){
//             sublist.add(nums[i]);
//             recurssion(list,sublist,nums,i+1);
//             sublist.remove(sublist.size()-1);
//         }
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Add the empty subset
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }
}