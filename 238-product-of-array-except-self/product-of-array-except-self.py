class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        result = [0]*n
        result[0]=1
        for i in range(1,n):
            result[i]=result[i-1]*nums[i-1]
        postfix = 1
        for i in range(n-1,-1,-1):
            result[i]=result[i]*postfix
            postfix = postfix*nums[i]
        return result

        