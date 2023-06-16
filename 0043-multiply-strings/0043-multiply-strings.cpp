class Solution {
public:
    string multiply(string num1, string num2) {
        // Base Case: when num1 is 0 or num2 is 0, the result by default will be 0
        if (num1 == "0" || num2 == "0") {
                return "0";
        }

        // Variable Declaration
        int len1 = num1.size();
        int len2 = num2.size();
        vector<int> products(len1 + len2, 0);

        // Multiply digit by digit (- '0' used for type casting)
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1[i] - '0';

            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2[j] - '0';

                int product = digit1 * digit2;
                int index = i + j + 1;
                
                // Store products in vector
                products[index] += product;
                products[index - 1] += products[index] / 10; // Handle carry
                products[index] %= 10;
            }
        }

        string result;
        // Construct the result string
        for (int num : products) {
            result += (num + '0');
        }

        // Remove leading zeros
        while (result.size() > 1 && result[0] == '0') {
            result.erase(result.begin());
        }

        return result;
    }
};