# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # Helper function for in-order traversal
        def inorder(node):
            if not node:
                return []
            return inorder(node.left) + [node.val] + inorder(node.right)
        
        # Perform in-order traversal to obtain sorted list of node values
        nodes = inorder(root)
        
        # Initialize the minimum absolute difference with a large value
        minDiff = float('inf')
        
        # Traverse the sorted list and update the minimum absolute difference
        for i in range(1, len(nodes)):
            diff = nodes[i] - nodes[i-1]
            minDiff = min(minDiff, diff)
        
        return minDiff
        