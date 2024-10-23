class Solution:
    def climbStairs(self, n: int) -> int:
        # for each step we are at, there are x unique ways to get there which only grows with more steps.
        # DP, store number of unique paths at each k from 1 to n and add until k=n
        num_paths = {i : 0 for i in range(n+1)}

        # at each step, we have a recursive relation
        for i in range(1, n+1):
            # 1, 2 are base cases
            if i == 1:
                num_paths[i]=1
            elif i == 2:
                num_paths[i]=2
            else:
                num_paths[i]+= num_paths[i-1] + num_paths[i-2]

        return num_paths[n]