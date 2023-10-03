class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        //add only characters, popping stars instead of adding them
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c=='*'){
                stack.pop();
            }else if(c!='*'){
                stack.push(c);
            }
        }
        char[] result = new char[stack.size()];
        //iterate in reverse
        for(int i=result.length-1;i>=0;i--){
            result[i] = stack.pop();
        }
        return new String(result);
    }
}