class Solution {
    public String convertToTitle(int columnNumber) {
        // Create Instance of String Builder in order to change the string
        StringBuilder outputString = new StringBuilder();
        
        while (columnNumber > 0) {// Loop until columnNumber larger than 0
            columnNumber--;  // Adjust to 0-based index
            
            // Calculating remainder and changing the output string
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            outputString.insert(0, ch);
            
            // Dividing the column number by 26 since, 26 is the number of letters
            columnNumber /= 26;
        }
        
        return outputString.toString();
    }
}
