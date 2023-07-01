class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // Set to store previously encountered numbers
        int num = n; // Initialize variable `num` with the given number `n`

        while (num != 1 && !seen.contains(num)) { // Repeat until `num` becomes 1 or is found in the set
            seen.add(num); // Add `num` to the set of seen numbers
            int sum = 0; // Variable to store the sum of the squares of the digits

            while (num > 0) { // Calculate the sum of the squares of the digits
                int digit = num % 10; // Extract the rightmost digit
                sum += digit * digit; // Square the digit and add it to the sum
                num /= 10; // Move to the next digit
            }

            num = sum; // Update `num` with the sum calculated in the previous step
        }

        return num == 1; // Check if `num` is equal to 1
    }
}