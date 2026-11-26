class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        e = n*(n+1)/2
        a = sum(nums)
        return e - a
        