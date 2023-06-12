class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        if not nums:
            return []

        result = []  # Initialize an empty list to store the ranges
        start = nums[0]  # Initialize the start of the range as the first number in `nums`

        for i in range(1, len(nums)):
            if nums[i] != nums[i-1] + 1:
                # If the current number is not consecutive to the previous number,
                # add the current range to the result list and update the start of the new range
                if start == nums[i-1]:
                    result.append(str(start))
                else:
                    result.append(str(start) + "->" + str(nums[i-1]))
                start = nums[i]

        # Add the last range to the result list
        if start == nums[-1]:
            result.append(str(start))
        else:
            result.append(str(start) + "->" + str(nums[-1]))

        return result