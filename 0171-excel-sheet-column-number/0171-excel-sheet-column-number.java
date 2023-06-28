class Solution {
    public int titleToNumber(String columnTitle) {
        // Declaring variables and letter lookup table
        Map<Character, Integer> columnMap = new HashMap<>();
        int columnNumber = 0;
        int power = 0;

        // Fill the map with column letter to number mappings
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            columnMap.put(ch, ch - 'A' + 1);
        }

        // Iterate through the columnTitle from right to left
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            columnNumber += columnMap.get(ch) * Math.pow(26, power);// 26 being the number of letters in the alphabet
            power++;
        }

        return columnNumber;
    }
}