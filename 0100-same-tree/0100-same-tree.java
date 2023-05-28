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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are structurally identical
        if (p == null && q == null) {
            return true;
        }
        
        // If one node is null while the other is not, they have different structures
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        
        // If the values of the current nodes are different, the trees are not the same
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check if the left subtrees and right subtrees are the same
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);
        
        // Return true if the left and right subtrees are also the same
        return leftSame && rightSame;
    }
}
