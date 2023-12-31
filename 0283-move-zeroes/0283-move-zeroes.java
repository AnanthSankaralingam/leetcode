class Solution {
    public void moveZeroes(int[] nums) {
        // declare left pointer
        int left = 0;
        // iterate over nums array with right pointer
        for(int right = 0; right < nums.length; right++) {
            // if right pointer is non zero:
            if(nums[right] != 0) {
                // create tmp variable to store right num
                int tmp = nums[right];
                // swap right num for left num
                nums[right] = nums[left];
                // swap left num for num that we stored in tmp
                nums[left] = tmp;
                // increment left pointer
                left++;
            }
        }
    }
}