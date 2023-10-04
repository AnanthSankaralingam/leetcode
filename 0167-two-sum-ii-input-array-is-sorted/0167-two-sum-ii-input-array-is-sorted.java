class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*since array is sorted, two pointers is more efficient than hashmap
        left pointer increased when sum less than target
        right pointer decremented when sum greater*/
        int left=0, right = numbers.length-1;
        while(left<right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1,right+1};
            }else if(numbers[left]+numbers[right] > target){
                right--;
            }else{
                left++;
            }
        } 
        return null;
    }
}