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

    void preorder(TreeNode root, List<TreeNode> nodes){
        if(root == null) return;

        nodes.add(root);
        preorder(root.left, nodes);
        preorder(root.right, nodes);

    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> nodes = new ArrayList<>();
        preorder(root, nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i + 1);
        }

        TreeNode last = nodes.get(nodes.size() - 1);
        last.left = null;
        last.right = null;
    }
}