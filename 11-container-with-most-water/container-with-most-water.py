class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        maximum = 0
        w = 0 
        h=0
        while left<right:
            w = right - left
            h = min(height[left],height[right])
            res = w*h
            maximum = max(res,maximum)
            if height[left]<height[right]:
                left+=1
            else: right-=1
        return maximum
        