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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        serializeHelper(root,sb);
        return sb.toString();
    }
    private void serializeHelper(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(',');
        serializeHelper(root.left,sb);
        serializeHelper(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ans= data.split(",");
        Queue<String> q= new LinkedList<>(Arrays.asList(ans));
        return deserializeHelper(q);
    }
    private TreeNode deserializeHelper(Queue<String> q){
        String ans= q.poll();
        if(ans.equals("#")){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(ans));

        node.left=deserializeHelper(q);
        node.right=deserializeHelper(q);
        return node;
    }
}
