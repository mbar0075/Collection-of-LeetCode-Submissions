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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // If the root is null, there are no nodes in the tree.
        // In this case, return false.
        if (root == null) {
            return false;
        }
        
        // If the current node is a leaf node (no left or right child),
        // check if its value is equal to the remaining target sum.
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        
        // Recursively check if there is a path from the left or right child
        // with the updated target sum (subtracting the value of the current node).
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}

