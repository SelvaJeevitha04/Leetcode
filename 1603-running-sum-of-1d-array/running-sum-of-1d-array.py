class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        total = 0
        for i in range(len(nums)):
            nums[i]= total+nums[i]
            total = nums[i]
        return nums
        