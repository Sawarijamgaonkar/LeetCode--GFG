class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }
    public void backtrack(int[] candidates, int remaining, List<List<Integer>> result, ArrayList<Integer> combination, int start){
        if(remaining==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        if(remaining<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            // remaining-=candidates[i];
            backtrack(candidates,remaining-candidates[i],result,combination,i);
            combination.remove(combination.size()-1);
        }
    }
}