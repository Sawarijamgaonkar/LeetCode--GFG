/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // optimal approach: TC=0(N), SC=O(h)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        else{
            return right;
        }
    }


    // my brute force thinking: it is wrong as I mistakenly considered p and q are given as ints. but they are given as nodes so I dont have to find them:
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null){
//             return null;
//         }
//         TreeNode nodeP=findNode(root,p);
//         TreeNode nodeQ=findNode(root,q);
//         if(Level(root,nodeP,0)==Level(root,nodeQ,0)){
//             return Parent(root,nodeP);
//         }
//         if(Level(root,nodeP,0)>Level(root,nodeQ,0)){
//             if(subTree(nodeP,nodeQ)){
//                 return nodeP;
//             }
//             return root;
//         }
//         else if(Level(root,nodeP,0)<Level(root,nodeQ,0)){
//             if(subTree(nodeP,nodeQ)){
//                 return nodeQ;
//             }
//             return root;
//         }
//         return root;
//     }
//     public TreeNode findNode(TreeNode node, int p){
//         if(node==null){
//             return null;
//         }
//         if(node.val==p){
//             return node;
//         }
//         TreeNode n=findNode(node.left,p);
//         if(n!=null){
//             return n;
//         }
//         return findNode(node.right,p);
//     }
//     public int Level(TreeNode node, TreeNode nodeP, int lev){
//         if(node==null){
//             return 0;
//         }
//         if(node==nodeP){
//             return lev;
//         }
//         int l=Level(node.left,nodeP,lev+1);
//         if(l!=0){
//             return l;
//         }
//         return Level(node.right,nodeP,lev+!);
//     }
//     public TreeNode Parent(TreeNode node,TreeNode nodeP){
//         if (root == null) {
//             return null;
//         }
//         if (root.data == target) {
//             return parent;
//         }

//         // Recursively search in left subtree
//         int leftSearch = findParent(root.left,
//                                     target, root.data);
  
//         if (leftSearch != -1) {
//             return leftSearch;
//         }

//         // Recursively search in right subtree
//         return findParent(root.right, target, root.data);

//     }

}