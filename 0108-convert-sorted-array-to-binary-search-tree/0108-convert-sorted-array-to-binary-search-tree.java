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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        // Base case: If left index is greater than right index, there are no more elements to consider
        if (left > right) {
            return null;
        }
        
        // Find the middle element of the current range
        int mid = (left + right) / 2;
        
        // Create a new TreeNode with the value of the middle element
        TreeNode root = new TreeNode(nums[mid]);
        
        // Recursively construct the left subtree using elements from left to mid-1
        root.left = sortedArrayToBST(nums, left, mid - 1);
        
        // Recursively construct the right subtree using elements from mid+1 to right
        root.right = sortedArrayToBST(nums, mid + 1, right);
        
        // Return the current node
        return root;
    }
}
