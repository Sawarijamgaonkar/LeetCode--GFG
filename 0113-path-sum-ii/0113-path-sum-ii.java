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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths=new LinkedList<>();
        List<Integer> path=new ArrayList<>();
        helper(root,targetSum,paths,path);
        return paths;
    }
    public void helper(TreeNode node, int sum,List<List<Integer>> paths,List<Integer> path){
        if(node==null){
            return;
        }
        path.add(node.val);
        if(node.val==sum&&node.right==null && node.left==null){
            paths.add(new ArrayList<>(path));
        }
        else{
            helper(node.left,sum-node.val,paths,path);
            helper(node.right,sum-node.val,paths,path);
        }



//  to backtrack we need to remove the last digiti so we remove from the last an element of size 1;
        path.remove(path.size( )-1);
    }
}