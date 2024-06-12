class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //sorted - think 2 pointers
        //inc left if sum too small, dec right if sum too big
        //while loop since either left or right changing
        int left = 0, right = numbers.length-1, sum;
        while(left != right){
            sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[] {left+1, right+1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return null;
    }
}