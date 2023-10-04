class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char c[] = s.toCharArray();
        int j = s.length() -1;
        for(int i=0;i<s.length(); i++){
            if(c[i]!=c[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}