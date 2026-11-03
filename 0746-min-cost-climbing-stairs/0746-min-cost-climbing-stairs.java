class Solution {

    int fun(int i, int[] cost, int[] dp){
    if(i>=cost.length) return 0;
    
    if(dp[i] != -1){
        return dp[i];
    }

    int step_1 = fun(i+1, cost, dp);
    int step_2 = fun(i+2, cost, dp);
    dp[i] = cost[i] + Math.min(step_1, step_2);
    return dp[i];
   }

   public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[1001];
        Arrays.fill(dp, -1);
        int a = fun(0,cost, dp);
        int b = fun(1, cost, dp);
        return Math.min(a,b);
       
    }
}