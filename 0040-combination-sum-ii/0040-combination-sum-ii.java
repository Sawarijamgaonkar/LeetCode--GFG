class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, result, new ArrayList<>(),0);
        return result;
    }
    public static void backtrack(int[] candidates, int remaining, List<List<Integer>> result, ArrayList<Integer> combination, int start){
        if(remaining==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start &&candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>remaining){
                break;
            }
            combination.add(candidates[i]);
            backtrack(candidates, remaining-candidates[i],result, combination, i+1);
            combination.remove(combination.size()-1);

        }
    }
}