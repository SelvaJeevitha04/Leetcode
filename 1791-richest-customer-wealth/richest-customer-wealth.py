class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        maximum = 0
        for i in range(len(accounts)):
            total = 0
            for j in range(len(accounts[i])):
                total+=accounts[i][j]
            maximum = max(maximum,total)
        return maximum
        