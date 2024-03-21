class Solution {
    public int maxSubArray(int[] nums) {
        //kadanes!!
        int sum = 0, max = nums[0];
        for(int num : nums){
            sum+=num;
            max = Math.max(sum, max);
            if(sum<0)
                sum = 0;
        }
        return max;
    }
}