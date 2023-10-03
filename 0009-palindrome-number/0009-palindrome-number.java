class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        char[] str = Integer.toString(x).toCharArray();
        int j= str.length - 1;
        for(int i=0; i<str.length; i++){
            if(str[i] != str[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}