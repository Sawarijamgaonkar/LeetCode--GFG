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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode result=null;
        if(nums.length==0){
            return result;
        }
        return help(nums, 0,nums.length-1);
        
    } 
    public TreeNode help(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=help(nums,left,mid-1);
        root.right=help(nums,mid+1,right);
        return root;
    }
}