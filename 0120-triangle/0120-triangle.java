class Solution {
    int[][] dp = new int[201][201];
    int fun(int i, int j, List<List<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(i).size();

        if (i == n - 1) return grid.get(i).get(j);


        if(dp[i][j] != -99999999) return dp[i][j];

        int c1 = grid.get(i).get(j) + fun(i + 1, j, grid);
        int c2 = grid.get(i).get(j) + fun(i + 1, j + 1, grid);

        return dp[i][j] = Math.min(c1, c2);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 0; i < 201; i++) {
            Arrays.fill(dp[i], -99999999);
        }
        return fun(0, 0, triangle);
    }
}