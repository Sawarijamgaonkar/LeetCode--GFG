/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }
    private void preorder(TreeNode node, StringBuilder sb){
        if(node==null){
            sb.append("N,");
            return;
        }
        sb.append(node.val).append(",");
        preorder(node.left,sb);
        preorder(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(q);
    }
    public TreeNode buildTree(Queue<String> q){
        String val=q.poll();
        if(val.equals("N")) return null;
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=buildTree(q);
        node.right=buildTree(q);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));