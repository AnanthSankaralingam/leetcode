class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = (word1.length()<word2.length()) ? word1.length() : word2.length();
        String result= "";
        for(int i=0; i<length; i++){
            result+= word1.substring(i,i+1);
            result+= word2.substring(i,i+1);
        } 
        if(word1.length() > word2.length()){
            result += word1.substring(length);
        }else if(word2.length() > word1.length()){
            result += word2.substring(length);
        }
        return result;
    }
}