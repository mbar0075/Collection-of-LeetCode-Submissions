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
    public int minDepth(TreeNode root) {
        // If the root is null, the tree is empty, so the minimum depth is 0.
        if (root == null) {
            return 0;
        }
        // If the root has no left or right child, it is a leaf node.
        // The depth of a leaf node is 1.
        if (root.right == null && root.left == null) {
            return 1;
        }
        // If the root has no right child, calculate the minimum depth of the left subtree
        // and add 1 to account for the current node.
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        // If the root has no left child, calculate the minimum depth of the right subtree
        // and add 1 to account for the current node.
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        // If the root has both left and right children, calculate the minimum depth of
        // both subtrees, and return the minimum of the two depths plus 1 to account for the current node.
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
