class Solution {
    public int lengthOfLastWord(String s) {
        // Retrieving length
        int length=0;
        int n=s.length()-1;
        // Checking for empty String
        if(n<0){
            return 0;
        }
        // Retrieving last Character
        char currentChar=s.charAt(n);
        // Remove trailing spaces
        while (n >= 0 && s.charAt(n) == ' ') {
            n--;
        }

        // Count length of last word
        while (n >= 0 && s.charAt(n) != ' ') {
            length++;
            n--;
        }
        // Returning length
        return length;
    }
}