class Solution {
    public int maxArea(int[] height) {
        //math.min for which height
        //two pointers - one to curr, one to end
        //work inwards with two pointers
        //max var of area
        int left=0, right=height.length-1;
        int max =0, h, area;
        if(height.length == 0){
            return 0;
        }
        while(left<=right){
            h = Math.min(height[left],height[right]);
            area = (right-left)*h;
            if(area > max){
                max=area;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}