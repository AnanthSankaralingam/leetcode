class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> out = new ArrayList<>();
        if(nums.length ==1){
            out.add(Integer.toString(nums[0]));
            return out;
        }else if(nums.length==0){
            return out;
        }
        int left = 0;
        for(int right=0; right<nums.length-1; right++){
            if(nums[right+1]-nums[right] != 1){
                if(left!=right)
                    out.add(Integer.toString(nums[left])+"->"+Integer.toString(nums[right]));
                else
                    out.add(Integer.toString(nums[right]));
                left = right+1;
            }
            
        }
        if(left==nums.length-1){
            out.add(Integer.toString(nums[left]));
        }else{
            out.add(nums[left]+"->"+nums[nums.length-1]);
        }
        return out;
    }
}