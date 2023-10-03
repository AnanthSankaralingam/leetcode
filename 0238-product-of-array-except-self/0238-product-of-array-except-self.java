class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Use left array and right array
        int[] left = new int[nums.length];
        int[] right= new int[nums.length];
        int leftProd = 1, rightProd = 1;

        for (int i = 0; i < nums.length; i++) {
            left[i] = leftProd;//declare left[i] first to exclude the current value of nums
            leftProd *= nums[i];
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightProd;
            rightProd *= nums[i];
        }
        //first index of right and left should be 1 always
        int[] result = new int[nums.length];
        //left array has product from left up to each index
        for(int i=0; i<nums.length; i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
}