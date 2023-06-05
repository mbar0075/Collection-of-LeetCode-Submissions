class Solution {
public:
    bool isPalindrome(string s) {
        int start = 0; // Start index of the string
        int end = s.length() - 1; // End index of the string
        
        while (start < end) { // Continue until start index surpasses end index
            if (!isalnum(s[start])) { // Skip non-alphanumeric characters at the start
                start++;
            }
            else if (!isalnum(s[end])) { // Skip non-alphanumeric characters at the end
                end--;
            }
            else if (tolower(s[start]) == tolower(s[end])) { // Compare characters in a case-insensitive manner
                start++;
                end--;
            }
            else { // Characters are different, not a palindrome
                return false;
            }
        }
        
        return true; // All characters matched, it is a palindrome
    }
};