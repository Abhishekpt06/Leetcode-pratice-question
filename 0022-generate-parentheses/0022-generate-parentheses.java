class Solution {
     void fun(String temp,int a, int b, int n, List<String> s) {
        if (a > n || b > n || b > a) {
            return;
        }

        if (temp.length() == 2 * n) {
            s.add(temp);
            return;
        }

        fun(temp + "(", a + 1, b, n, s);
        fun(temp + ")", a, b + 1, n, s);
        
        
    }
    public List<String> generateParenthesis(int n) {
       List<String> s = new ArrayList<>();
        fun("", 0, 0, n, s);
        return s;
    }
}