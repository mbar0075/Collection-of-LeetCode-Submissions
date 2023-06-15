/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxLevelSum(TreeNode* root) {
        // Base Case
        if (root == nullptr)
            return 0;
        
        // Declare variables
        int maxLevel = 1; // Track the level with the maximum sum
        int maxSum = root->val; // Initialize the maximum sum with the root's value

        queue<TreeNode*> q;
        q.push(root);
        int level = 1;
        
        // Loop until queue is not empty
        while (!q.empty()) {
            int size = q.size();
            int sum = 0;

            // Process nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode* node = q.front();
                q.pop();
                sum += node->val;

                // Enqueue the children of the current node
                if (node->left)
                    q.push(node->left);
                if (node->right)
                    q.push(node->right);
            }

            // Update the maximum sum and level if necessary
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }

            level++;

            // Continue to the next level
        }

        return maxLevel;
    }

};