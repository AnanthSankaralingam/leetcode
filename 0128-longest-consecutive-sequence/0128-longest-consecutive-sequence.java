class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0)
            return 0;
        //sort nums, store max value 
        Arrays.sort(nums);
        int max=1, currStreak = 1;
        for(int i =0; i<nums.length; i++){
            if(i!=0 && nums[i]-nums[i-1]==1){
                currStreak++;
            }else if(i!=0 && nums[i]!=nums[i-1]){
                //have to check for duplicates!
                max = Math.max(currStreak, max);
                currStreak =1;
            }
                
        }
        return Math.max(max, currStreak);
    }
}