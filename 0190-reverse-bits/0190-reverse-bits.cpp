class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t result = 0;
        int bitCount = 32;
        
        while (bitCount > 0) {
            // Shift the result to the left by 1 bit
            result <<= 1;
            
            // Extract the least significant bit from n and add it to the result
            result |= (n & 1);
            
            // Shift n to the right by 1 bit
            n >>= 1;
            
            bitCount--;
        }
        
        return result;
    }
};
// NB: >>= and <<= shift the bits of the number by an offset position and assign the result back to number