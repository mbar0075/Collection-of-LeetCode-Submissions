class Solution {
public:
    string countAndSay(int n) {
        // Base Case
        if(n==1){
            return "1";
        }
        // Recursive call to get the previous string
        string previous = countAndSay(n - 1); 
        string result;

        int count = 1;
        for (int i = 0; i < previous.length(); i++) {
            // If the current character is the same as the next character
            if (i + 1 < previous.length() && previous[i] == previous[i + 1]) {
                count++; // Increment the count
            } else {
                // If the current character is different from the next character
                result += to_string(count) + previous[i]; // Append count and digit to the result
                count = 1; // Reset the count
            }
        }

        return result;
    }
};