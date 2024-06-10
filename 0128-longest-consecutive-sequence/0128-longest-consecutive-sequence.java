class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int count = 1, max = 0;
        for(int i=0; i<nums.length; i++){
            //optimize by only running if the smallest element in subsequence
            if(!set.contains(nums[i] - 1)){    
                while(set.contains(nums[i] + count))
                    count++;
                max = Math.max(count, max);
                count = 1;
            }
        }
        return max;
    }
}