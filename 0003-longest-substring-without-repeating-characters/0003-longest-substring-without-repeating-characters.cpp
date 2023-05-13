class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        unordered_set<char> seen;
        int ans = 0, left = 0, right = 0;

        while (left < n && right < n) {
            if (!seen.count(s[right])) {
                seen.insert(s[right++]);
                ans = max(ans, right - left);
            } else {
                seen.erase(s[left++]);
            }
        }

        return ans;
    }
};