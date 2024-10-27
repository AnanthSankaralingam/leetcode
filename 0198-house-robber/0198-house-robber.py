class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        # from each index, store max val of breaking in that day in dp table
        res = max(nums[0], nums[1])
        dp = [nums[0], max(nums[0], nums[1])]
        # base cases are first 2 houses, which are already at max of that index
        for i in range(2, len(nums)):
            dp.append(max(dp[i-1], dp[i-2] + nums[i]))
            res = max(res, dp[i])
        
        return res
