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

//  BFS:
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result=new ArrayList<>();
//         if(root==null) return result;
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.add(root);
//         while(!queue.isEmpty()){
//             int levelSize=queue.size();
//             List<Integer> curr_list=new ArrayList<>(levelSize);
//             for(int i=0;i<levelSize;i++){
//                 TreeNode node=queue.poll();
//                 curr_list.add(node.val);
//                 if(node.left!=null) queue.add(node.left);
//                 if(node.right!=null) queue.add(node.right);
//             }
//             result.add(curr_list);
//         }
//         return result;
//     }
// }

// DFS:
class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root,0);
        return result;
    }
    public void levelOrder(TreeNode root, int level){
        if(root==null) return;
        if(result.size()<=level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
    }
}