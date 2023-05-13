class Solution(object):
    def twoSum(self, nums, target):
        output={}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in output:
                return (output[complement], i)
            output[num] = i

        return output
