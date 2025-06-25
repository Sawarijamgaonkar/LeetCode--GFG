/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> path=new LinkedList<>();
        return helper(root,targetSum,path);
    }
    public int helper(TreeNode node, long sum,List<Integer> path){
        if(node==null){
            return 0;
        }
        path.add(node.val);
        int count=0;
        long currSum=0;
        count+=helper(node.left,sum,path)+helper(node.right,sum,path);

        // how many paths I can make:
        ListIterator<Integer> pathIterator=path.listIterator(path.size());
        while(pathIterator.hasPrevious()){
            currSum+=pathIterator.previous();
            if(currSum==sum){
                count++;
            }
        }


//  to backtrack we need to remove the last digiti so we remove from the last an element of size 1;
        path.remove(path.size( )-1);
        return count;
    }
}