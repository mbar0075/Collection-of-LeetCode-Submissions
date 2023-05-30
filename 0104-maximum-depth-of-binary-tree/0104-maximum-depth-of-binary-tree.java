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
    public int maxDepth(TreeNode root) {
        // If the root node is null, the depth is 0.
        if (root == null) {
            return 0;
        }
        
        // If the root node has no children, the depth is 1.
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        // Recursively calculate the maximum depth of the left and right subtrees,
        // and return the maximum depth among them plus 1 (for the current level).
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
