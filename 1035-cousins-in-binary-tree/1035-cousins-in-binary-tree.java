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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xNode=findNode(root,x);
        TreeNode yNode=findNode(root,y);
        return (level(root,xNode,0)==level(root,yNode,0)) && (!isSibling(root,xNode,yNode));  
    }
    public TreeNode findNode(TreeNode node, int value){
        if(node==null){
            return null;
        }
        if(node.val==value){
            return node;
        }
        TreeNode n=findNode(node.left,value);
        if(n!=null){
            return n;
        }
        return findNode(node.right, value);
    }
    public int level(TreeNode node, TreeNode x, int level){
        if(node==null){
            return 0;
        }
        if(node==x){
            return level;
        }
        int l=level(node.left,x,level+1);
        if(l!=0){
            return l;
        }
        return level(node.right,x,level+1);
    }
    public boolean isSibling(TreeNode parent, TreeNode child1, TreeNode child2){
        if(parent==null){
            return false;
        }
        return ((parent.left==child1 && parent.right==child2)||(parent.left==child2 && parent.right==child1)|| isSibling(parent.left,child1,child2)|| isSibling(parent.right,child1,child2));
    }
}