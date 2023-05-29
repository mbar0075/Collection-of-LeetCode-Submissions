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
    public boolean isSymmetric(TreeNode root) {
        // Check if the root is null, it is symmetric
        if (root == null) {
            return true;
        }
        
        // Call the helper method to check if left and right subtrees are mirrors
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        // If both left and right nodes are null, they are symmetric
        if (left == null && right == null) {
            return true;
        }
        
        // If either left or right node is null (but not both), they are not symmetric
        if (left == null || right == null) {
            return false;
        }
        
        // Check if the values of left and right nodes are equal
        // and recursively check if their corresponding subtrees are mirrors
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
