class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if lengths are equal
        if (s.length() != t.length()) {
            return false;
        }

        // Create two dictionaries for mapping characters
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        // Iterate over characters in string s
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if sChar already exists in sToT
            if (sToT.containsKey(sChar)) {
                if (sToT.get(sChar) != tChar) {
                    return false; // Violates isomorphism condition
                }
            } else {
                sToT.put(sChar, tChar); // Add mapping to sToT
            }

            // Check if tChar already exists in tToS
            if (tToS.containsKey(tChar)) {
                if (tToS.get(tChar) != sChar) {
                    return false; // Violates isomorphism condition
                }
            } else {
                tToS.put(tChar, sChar); // Add mapping to tToS
            }
        }

        // Step 4: Return true if isomorphic
        return true;
    }
}
