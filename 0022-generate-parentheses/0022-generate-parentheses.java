class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        aux(res, "", 0, 0, n);
        return res;
    }
    public void aux(List<String> res, String curr, int open, int close, int n){
        if(curr.length() == n * 2){
            res.add(curr);
            return;
        }
        if(open < n){
            aux(res, curr+'(', open+1, close, n);
        } 
        if(close < open){
            aux(res, curr+')', open, close+1, n);
        }
    }
}