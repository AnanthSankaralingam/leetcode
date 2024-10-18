class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        if len(nums)==1:
            return [nums]

        # Helper function to recursively build permutations
        def aux(current: List[int], remaining:List[int]):
            # If there are no remaining elements, permutation
            if not remaining:
                res.append(current)  
                return
            
            # Try each element as the starting point for the next permutation
            # by adding lists, u get new list that doesnt return none
            for i in range(len(remaining)):
                aux(current + [remaining[i]], remaining[:i] + remaining[i+1:])

        # Start the recursive process
        aux([], nums)
        return res