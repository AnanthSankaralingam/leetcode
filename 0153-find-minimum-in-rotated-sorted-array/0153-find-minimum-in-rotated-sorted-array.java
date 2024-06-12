class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int left = 0, right = nums.length-1;
        /*since sorted, use binary search. condition for minimum is if mid is greater than left pter, the left sub array is sorted so minimum is in right subarray. Else right. O log n time and O(1) space */
        while(left<=right){
            if(nums[left]<nums[right]) //sub array already sorted
                return Math.min(min,nums[left]);

            int m = (left + right)/2; //median
            min=Math.min(nums[m], min);
            if(nums[m]>=nums[left]) //min is in right sorted sub array
                left = m+1;
            else
                right = m-1;
        }
        return min;
    }

}