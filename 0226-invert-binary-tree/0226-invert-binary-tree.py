# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        # Recursive Case when root is not None
        if(root is not None):
            # Flipping pointers
            tmp=root.right
            root.right=self.invertTree(root.left)
            root.left=self.invertTree(tmp)
        return root
        