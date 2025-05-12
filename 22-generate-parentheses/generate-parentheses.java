class Solution {
    List<String> ans = new LinkedList<>();
    int nn;

    private void fn(StringBuilder s, int open, int close) {
        if (open == nn && open == close) {
            ans.add(s.toString());
            return;
        }
        if (open < nn) {
            s.append("(");
            fn(s, open + 1, close);
            s.deleteCharAt(s.length() - 1);  // Backtrack
        }
        if (close < open) {
            s.append(")");
            fn(s, open, close + 1);
            s.deleteCharAt(s.length() - 1);  // Backtrack
        }
    }
    public List<String> generateParenthesis(int n) {
        nn = n;
        fn(new StringBuilder(), 0, 0);
        return ans;
    }
}