class Solution {
public:
    int largestAltitude(std::vector<int>& gain) {
        int highestAltitude = 0; // Variable to store the highest altitude
        int currentAltitude = 0; // Variable to keep track of the current altitude

        for (int i = 0; i < gain.size(); i++) {
            currentAltitude += gain[i]; // Update the current altitude by adding the gain
            highestAltitude = max(highestAltitude, currentAltitude); // Update the highest altitude if necessary
        }

        return highestAltitude; // Return the highest altitude
    }
};