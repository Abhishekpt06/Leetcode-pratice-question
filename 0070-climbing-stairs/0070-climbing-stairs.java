class Solution {
    
    int fun(int n, int currSteps, int[] dp){
        if(currSteps > n) return 0;
        if(currSteps == n) return 1;

        if(dp[currSteps] != -1) return dp[currSteps];

        int c1 = fun(n, currSteps+1, dp);
        int c2 = fun(n, currSteps+2, dp);

        return dp[currSteps] = c1 + c2;

    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fun(n, 0, dp);
        
    }
}