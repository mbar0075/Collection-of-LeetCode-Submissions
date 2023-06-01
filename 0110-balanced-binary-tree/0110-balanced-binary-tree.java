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
    // Lookup table to store heights of visited nodes
    private Map<TreeNode, Integer> heightMap;
    
    public boolean isBalanced(TreeNode root) {
        heightMap = new HashMap<>();
        return checkBalanced(root);
    }
    
    private boolean checkBalanced(TreeNode node) {
        if (node == null) {
            return true; // An empty tree is considered balanced
        }
        
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        // Check if the heights of the left and right subtrees differ by at most one
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        
        // Recursively check if the left and right subtrees are balanced
        return checkBalanced(node.left) && checkBalanced(node.right);
    }
    
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        // Check if the height of the current node is already calculated
        if (heightMap.containsKey(node)) {
            return heightMap.get(node);
        }
        
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        // The height of the current node is the maximum height of its left and right subtrees plus 1
        int height = Math.max(leftHeight, rightHeight) + 1;
        
        // Store the height in the lookup table
        heightMap.put(node, height);
        
        return height;
    }
}
