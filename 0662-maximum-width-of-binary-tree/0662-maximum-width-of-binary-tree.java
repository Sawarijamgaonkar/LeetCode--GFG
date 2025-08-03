class Solution {
public class Pair<K, V> {
K key;
V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxWidth = 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));
        while (!queue.isEmpty()) {
            int size = queue.size();
            int first = 0, last = 0;
            int min = queue.peek().getValue();
            for(int i=0; i<size; i+=1){
                int currIndex = queue.peek().getValue()-min;
                TreeNode node = queue.peek().getKey();
                queue.poll();
                if(i==0){
                    first = currIndex; 
                }
                if(i==size-1){
                    last = currIndex;
                }
                if(node.left!=null){
                    queue.offer(new Pair<>(node.left, 2*currIndex+1));
                }
                if(node.right!=null){
                    queue.offer(new Pair<>(node.right, 2*currIndex+2));
                }
            }
            maxWidth = Math.max(maxWidth,last-first + 1);
        }
        return maxWidth;
    }
}

