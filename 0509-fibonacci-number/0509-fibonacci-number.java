class Solution {
    int[] dp = new int[31];
    
    int fun(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        if(dp[n] != -1) return dp[n];

        int ans1 = fun(n-1);
        int ans2 = fun(n-2);

        int ans = ans1 + ans2;
        return dp[n] = ans; 
    }
    public int fib(int n) {
        Arrays.fill(dp, -1);
        return fun(n);
        
    }
}