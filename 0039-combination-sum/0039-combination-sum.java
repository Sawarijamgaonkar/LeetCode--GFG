class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }
    public static void backtrack(int[] candidates, int remaining, List<Integer> combination, List<List<Integer>> result,int start){
        if(remaining==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        if(remaining<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            backtrack(candidates,remaining-candidates[i],combination,result,i);
            combination.remove(combination.size()-1);
        }
    }
}