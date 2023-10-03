class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int alt = 0;
        for(int i=0; i<gain.length; i++){
            if(alt > max){
                max = alt;
            }
            alt += gain[i];
        }
        if(alt > max){
            max = alt;
        }
        return max;
    }
}