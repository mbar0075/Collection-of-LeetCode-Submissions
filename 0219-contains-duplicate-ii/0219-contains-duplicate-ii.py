class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        # Declaring a dictionary to store the indices of seen numbers
        num_indices = {}  
        
        # Looping through the list
        for i, num in enumerate(nums):
            # Checking condition
            if num in num_indices and i - num_indices[num] <= k:
                return True  # Found a duplicate within k distance
            num_indices[num] = i  # Update the index of the number
        
        return False  # No duplicate found within k distance
