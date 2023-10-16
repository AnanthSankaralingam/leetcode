class Solution {
    public int search(int[] nums, int target) {
        int begin = 0, mid, end = nums.length-1;
        while(begin<=end){
            mid = begin + (end - begin)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                begin = mid + 1;
            }
        }
        return -1;
    }
}