class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[' || stack.isEmpty())
                stack.push(c);
            else if(!stack.isEmpty()){
                if(stack.peek() == '(' && c == ')')
                    stack.pop();
                else if(stack.peek() == '{' && c == '}')
                    stack.pop();
                else if(stack.peek() == '[' && c == ']')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.size() == 0;
    }
}