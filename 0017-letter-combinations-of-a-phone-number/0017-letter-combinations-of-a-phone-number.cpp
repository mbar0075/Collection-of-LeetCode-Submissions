class Solution {
public:
    vector<string> letterCombinations(string digits) {
        // Lookup dictionary
        unordered_map<char, string> mobileKeys = {
            {'2', "abc"},
            {'3', "def"},
            {'4', "ghi"},
            {'5', "jkl"},
            {'6', "mno"},
            {'7', "pqrs"},
            {'8', "tuv"},
            {'9', "wxyz"}
        };
        // Declaring output
        vector<string> output;
        // Error checking empty input
        if (digits.empty()) {
            return output;
        }
        // Generating combinations
        output.push_back(""); // Start with an empty string
        for (char digit : digits) {
            const string& letters = mobileKeys[digit];
            vector<string> temp;
            for (char letter : letters) {
                for (const string& str : output) {
                    temp.push_back(str + letter);
                }
            }
            output = temp;
        }
        return output;
    }
};
