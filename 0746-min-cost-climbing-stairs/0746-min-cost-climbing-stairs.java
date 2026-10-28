class Solution {
    int[] dp = new int[1001];

    int fun(int i, int[] cost){
    if(i>=cost.length) return 0;
    
    if(dp[i] != -1){
        return dp[i];
    }

    int step_1 = fun(i+1, cost);
    int step_2 = fun(i+2, cost);
    dp[i] = cost[i] + Math.min(step_1, step_2);
    return dp[i];
   }

   public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp, -1);
        int a = fun(0,cost);
        int b = fun(1, cost);
        return Math.min(a,b);
       
    }
}