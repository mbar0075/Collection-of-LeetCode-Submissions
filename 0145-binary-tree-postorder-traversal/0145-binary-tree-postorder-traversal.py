# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # Base Case: root is None
        if(root is None):
            return []
        # Recursive Case: Left, Right, Visit
        return self.postorderTraversal(root.left)+self.postorderTraversal(root.right)+[root.val]
        