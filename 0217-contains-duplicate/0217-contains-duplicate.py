class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        n = set(nums)
        return len(n) != len(nums)